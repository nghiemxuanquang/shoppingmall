package com.common;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

	public void sendMail(String to, String subject, String text) {
		   final String username = "globepoint.shopping@gmail.com";
		   final String password = "quang7811374";
		   Properties props = new Properties();
		   props.put("mail.smtp.auth", "true");
		   props.put("mail.smtp.starttls.enable", "true");
		   props.put("mail.smtp.host", "smtp.gmail.com");
		   props.put("mail.smtp.port", "587");
		   Session session = Session.getInstance(props,
		   new javax.mail.Authenticator() {
		      protected PasswordAuthentication getPasswordAuthentication() {
		        return new PasswordAuthentication(username, password);
		      }
		   });
		   try {
		     Message message = new MimeMessage(session);
		     message.setHeader("Content-Type", "text/plain; charset=UTF-8");
		     message.setFrom(new InternetAddress(username));
		     message.setRecipients(Message.RecipientType.TO,
		     InternetAddress.parse(to));
		     message.setSubject(subject);
		     message.setText(text);
		     Transport.send(message);
		     System.out.println("Sent message successfully ...");
		   } catch (MessagingException e) {
		     throw new RuntimeException(e);
		   }
		}
	
}

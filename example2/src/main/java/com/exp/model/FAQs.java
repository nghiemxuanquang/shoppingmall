package com.exp.model;

public class FAQs {
	int faqs_id;
	String question;
	String answer;
		
	public int getFaqs_id() {
		return faqs_id;
	}
	public void setFaqs_id(int faqs_id) {
		this.faqs_id = faqs_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FAQs [FAQs_id=");
		builder.append(faqs_id);
		builder.append(", Question=");
		builder.append(question);
		builder.append(", Answer=");
		builder.append(answer);	
		builder.append("]");
		return builder.toString();
	}
}

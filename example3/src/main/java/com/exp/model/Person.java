package com.exp.model;

import java.sql.Date;

public class Person {
	int person_id;
	String name;
	String phone;
	String ID_no;
	String email;
	String address;
	Date birth;
	int gender;
	String username;
	String password;
	
	
		
	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getID_no() {
		return ID_no;
	}

	public void setID_no(String iD_no) {
		ID_no = iD_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	


	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [Person_id=");
		builder.append(person_id);
		builder.append(", Name=");
		builder.append(name);
		builder.append(", Phone=");
		builder.append(phone);	
		builder.append(", ID_No=");
		builder.append(ID_no);	
		builder.append(", Email=");
		builder.append(email);	
		builder.append(", Address=");
		builder.append(address);	
		builder.append(", Birth=");
		builder.append(birth);	
		builder.append(", Gender=");
		builder.append(gender);	
		builder.append(", Username=");
		builder.append(username);	
		builder.append(", Password=");
		builder.append(password);	
		builder.append("]");
		return builder.toString();
	}
}

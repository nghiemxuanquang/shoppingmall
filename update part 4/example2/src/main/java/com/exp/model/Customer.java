package com.exp.model;

import java.sql.Date;

public class Customer {
	int customer_id;
	int person_id;
	Date lasted_login;
	Date reg_date;
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public Date getLasted_login() {
		return lasted_login;
	}
	public void setLasted_login(Date lasted_login) {
		this.lasted_login = lasted_login;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [Cus_id=");
		builder.append(customer_id);
		builder.append(", Person_id=");
		builder.append(person_id);	
		builder.append(", lasted_login=");
		builder.append(lasted_login);	
		builder.append(", reg_date=");
		builder.append(reg_date);	
		builder.append("]");
		return builder.toString();
	}
	
}

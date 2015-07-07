package com.exp.model;

import java.sql.Date;

public class Employee {
	int employee_id;
	int role_id;
	int person_id;
	Date create_date;
	
	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [Emp_id=");
		builder.append(employee_id);
		builder.append(", Role_id=");
		builder.append(role_id);
		builder.append(", Person_id=");
		builder.append(person_id);	
		builder.append(", Create_date=");
		builder.append(create_date);	
		builder.append("]");
		return builder.toString();
	}
}

package com.exp.model;

public class Emp_Roles {
	int role_id;
	String position;
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emp_Roles [Role_id=");
		builder.append(role_id);
		builder.append(", Position=");
		builder.append(position);		
		builder.append("]");
		return builder.toString();
	}
}

package com.exp.model;

public class Category {
	int category_id;
	String category_name;
	int parent_id;
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Category [Cate_id=");
		builder.append(category_id);
		builder.append(", Cate_Name=");
		builder.append(category_name);	
		builder.append(", parent_id=");
		builder.append(parent_id);	
		builder.append("]");
		return builder.toString();
	}
}

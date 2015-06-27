package com.exp.model;

public class Supplier {
	int supplier_id;
	String supplier_name;
	String supplier_address;
	String supplier_tel;
	public int getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}
	public String getSupplier_name() {
		return supplier_name;
	}
	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}
	public String getSupplier_address() {
		return supplier_address;
	}
	public void setSupplier_address(String supplier_address) {
		this.supplier_address = supplier_address;
	}
	public String getSupplier_tel() {
		return supplier_tel;
	}
	public void setSupplier_tel(String supplier_tel) {
		this.supplier_tel = supplier_tel;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Supplier [Supplier_id=");
		builder.append(supplier_id);
		builder.append(", Supplier_name=");
		builder.append(supplier_name);
		builder.append(", Supplier_address=");
		builder.append(supplier_address);
		builder.append(", Supplier_tel=");
		builder.append(supplier_tel);		
		builder.append("]");
		return builder.toString();
	}
}

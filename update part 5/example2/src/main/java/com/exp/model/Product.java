package com.exp.model;

import java.sql.Date;

public class Product {
	int product_id;
	int category_id;
	int supplier_id;
	String product_name;
	String product_detailshort;
	String product_detailfull;
	int product_importprice;
	int product_saleprice;
	String product_status;
	Date date_added;
	Date last_modified;
	
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public int getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}

	public String getProduct_detailshort() {
		return product_detailshort;
	}
	public void setProduct_detailshort(String product_detailshort) {
		this.product_detailshort = product_detailshort;
	}
	public String getProduct_detailfull() {
		return product_detailfull;
	}
	public void setProduct_detailfull(String product_detailfull) {
		this.product_detailfull = product_detailfull;
	}
	public int getProduct_importprice() {
		return product_importprice;
	}
	public void setProduct_importprice(int product_importprice) {
		this.product_importprice = product_importprice;
	}
	public int getProduct_saleprice() {
		return product_saleprice;
	}
	public void setProduct_saleprice(int product_saleprice) {
		this.product_saleprice = product_saleprice;
	}
	public String getProduct_status() {
		return product_status;
	}
	public void setProduct_status(String product_status) {
		this.product_status = product_status;
	}
	public Date getDate_added() {
		return date_added;
	}
	public void setDate_added(Date date_added) {
		this.date_added = date_added;
	}
	public Date getLast_modified() {
		return last_modified;
	}
	public void setLast_modified(Date last_modified) {
		this.last_modified = last_modified;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [Product_id=");
		builder.append(product_id);
		builder.append(", Category_id=");
		builder.append(category_id);	
		builder.append(", Supplier_id=");
		builder.append(supplier_id);	
		builder.append(", Product_name=");
		builder.append(product_name);	
		builder.append(", Product_detailshort=");
		builder.append(product_detailshort);	
		builder.append(", Product_detailfull=");
		builder.append(product_detailfull);	
		builder.append(", Product_importprice=");
		builder.append(product_importprice);
		builder.append(", Product_saleprice=");
		builder.append(product_saleprice);	
		builder.append(", Product_status=");
		builder.append(product_status);	
		builder.append(", Date_added=");
		builder.append(date_added);	
		builder.append(", Last_modified=");
		builder.append(last_modified);	
		builder.append("]");
		return builder.toString();
	}
	
	
}

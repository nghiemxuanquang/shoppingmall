package com.exp.model;

import org.springframework.web.multipart.MultipartFile;

public class Product_Image {
	int image_id;
	int product_id;
	String image_url;
	MultipartFile file;
	
	
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public int getImage_id() {
		return image_id;
	}
	public void setImage_id(int image_id) {
		this.image_id = image_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product_image [Image_id=");
		builder.append(image_id);
		builder.append(", Product_id=");
		builder.append(product_id);	
		builder.append(", Image_url=");
		builder.append(image_url);
		builder.append(", file=");
		builder.append(file);
		builder.append("]");
		return builder.toString();
	}
}

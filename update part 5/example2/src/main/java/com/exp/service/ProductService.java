package com.exp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import com.exp.model.Product;

public interface ProductService {
	public List<Product> getlistProduct();
	public ArrayList<HashMap<String, String>> getProductDetaiList();
	Product getProductByID(int id);
	public void addNewProduct(Product product);
	public void updateProduct(Product product);
	public void deleteProduct(Product product);
	
}

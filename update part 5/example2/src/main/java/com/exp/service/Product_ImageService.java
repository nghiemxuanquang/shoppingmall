package com.exp.service;
import java.util.*;
import com.exp.model.*;
public interface Product_ImageService {
	public List<Product_Image> getlistImage();
	public List<Product_Image> getListImageByProductID(int pro_id);
	public void addNewImage(Product_Image img);
	public void updateImage(Product_Image img);
	public void deleteImage(Product_Image img);
}

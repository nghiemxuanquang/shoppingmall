package com.exp.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp.model.Product_Image;

@Service
public class Product_ImageServiceImp implements Product_ImageService{

	@Autowired
	SqlSession sqlSession;
	@Override
	public List<Product_Image> getlistImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product_Image> getListImageByProductID(int pro_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNewImage(Product_Image img) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateImage(Product_Image img) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteImage(Product_Image img) {
		// TODO Auto-generated method stub
		
	}

}

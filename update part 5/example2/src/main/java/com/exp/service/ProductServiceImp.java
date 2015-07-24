package com.exp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp.model.Product;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	SqlSession sqlSession;
	@Override
	public List<Product> getlistProduct() {
		// TODO Auto-generated method stub
		List<Product> listProduct = sqlSession.selectList("ProductControlMapper.getProductList");
		return listProduct;
	}

	@Override
	public ArrayList<HashMap<String, String>> getProductDetaiList() {
		// TODO Auto-generated method stub
		@SuppressWarnings({  "unchecked", "rawtypes" })
		ArrayList<HashMap<String, String>> listProduct =(ArrayList)sqlSession.selectList("ProductControlMapper.getProductDetailList");
		return listProduct;
	}

	@Override
	public void addNewProduct(Product product) {
		// TODO Auto-generated method stub
		sqlSession.insert("ProductControlMapper.insertProduct",product);
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(Product product) {
		// TODO Auto-generated method stub
		sqlSession.selectOne("ProductControlMapper.deleteProduct",product);
	}

	@Override
	public Product getProductByID(int id) {
		// TODO Auto-generated method stub
		Product returnproduct = sqlSession.selectOne("ProductControlMapper.getProductDetailByID",id);
		return returnproduct;
	}

}

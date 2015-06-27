package com.exp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp.model.Customer;

@Service
public class CustomerServiceImp implements CustomerService{

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<Customer> getCustomerList() {
		// TODO Auto-generated method stub
		List<Customer> customerList = sqlSession.selectList("CustomerControlMapper.getCustomerList");
		return customerList;
	}

	@Override
	public Customer getCustomerByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomer(Customer cust) {
		// TODO Auto-generated method stub
		sqlSession.update("CustomerControlMapper.modifyLastedLogin");
	}

	@Override
	public void addNewCustomer(Customer cust) {
		// TODO Auto-generated method stub
		sqlSession.insert("CustomerControlMapper.insertCustomer");
	}
	@Override
	public void registerCustomer(int person_id){
		sqlSession.insert("CustomerControlMapper.registerCustomer",person_id);
		
	}

	@Override
	public void deleteCustomer(Customer cust) {
		// TODO Auto-generated method stub
		sqlSession.selectOne("CustomerControlMapper.deleteCustomer",cust);
		
	}

	@SuppressWarnings("rawtypes")
	@Override
	public ArrayList<HashMap<String, String>> getCustomerList2() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		ArrayList<HashMap<String, String>> customerList =(ArrayList)sqlSession.selectList("CustomerControlMapper.getCustomerList2");
		return customerList;
	}

	@Override
	public void deleteCustomerByPersonID(int id) {
		// TODO Auto-generated method stub
		sqlSession.selectOne("CustomerControlMapper.deleteCustomerByPersonID",id);
	}

}

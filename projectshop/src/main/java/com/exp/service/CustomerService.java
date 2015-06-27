package com.exp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.exp.model.Customer;


public interface CustomerService {
	public List<Customer> getCustomerList();
	public ArrayList<HashMap<String, String>> getCustomerList2();
	Customer getCustomerByID(int id);
	public void updateCustomer(Customer cust);
	public void addNewCustomer(Customer cust);
	public void registerCustomer(int person_id);
	public void deleteCustomer(Customer cust);
	public void deleteCustomerByPersonID(int id);
}

package com.exp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



import com.exp.model.Employee;

public interface EmployeeService {
	public ArrayList<HashMap<String, String>> getEmployeeList1();
	public List<Employee> getEmployeeList();
	Employee getEmployeeByID(int id);
	public void createEmployee(int person_id,int role_id);
	public void updateEmployee(Employee emp);
	public void addNewEmployee(Employee emp);
	public void deleteEmployee(Employee emp);
}

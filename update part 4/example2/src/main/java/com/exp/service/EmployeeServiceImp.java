package com.exp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService{

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		//ArrayList<HashMap<String, String>> employeeList =(ArrayList)sqlSession.selectList("EmployeeControlMapper.getEmpList");
		List<Employee> employeeList =sqlSession.selectList("EmployeeControlMapper.getEmpList");
		return employeeList;
	}

	@Override
	public Employee getEmployeeByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewEmployee(Employee emp) {
		// TODO Auto-generated method stub
		sqlSession.insert("EmployeeControlMapper.insertEmp");
	}

	@Override
	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		sqlSession.selectOne("EmployeeControlMapper.deleteEmp",emp);
	}

	@Override
	public ArrayList<HashMap<String, String>> getEmployeeList1() {
		// TODO Auto-generated method stub
		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList<HashMap<String, String>> employeeList =(ArrayList)sqlSession.selectList("EmployeeControlMapper.getEmployeeList2");
		return employeeList;
	}

	@Override
	public void createEmployee(int person_id,int role_id) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setRole_id(role_id);
		emp.setPerson_id(person_id);		
		sqlSession.insert("EmployeeControlMapper.insertEmp", emp);
	}

	



}

package com.exp.service;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp.model.Emp_Roles;

@Service
public class EmpRoleServiceImp implements EmpRoleService {
	
	@Autowired
	SqlSession sqlSession;
	
	
	@Override
	public List<Emp_Roles> getRoleList() {
		// TODO Auto-generated method stub
		List<Emp_Roles> roleList = sqlSession.selectList("EmpRoleControlMapper.getRoleList");
		return roleList;
	}


	@Override
	public Emp_Roles getRoleByID(int id) {
		// TODO Auto-generated method stub
		Emp_Roles modifyRole = sqlSession.selectOne("EmpRoleControlMapper.selectOneRole",id);
		return modifyRole;
	}


	@Override
	public void updateRole(Emp_Roles emp) {
		// TODO Auto-generated method stub
		sqlSession.update("EmpRoleControlMapper.modifyRole",emp);
		
	}


	@Override
	public void addNewRole(Emp_Roles emp) {
		// TODO Auto-generated method stub
		sqlSession.insert("EmpRoleControlMapper.insertRole",emp);
	}


	@Override
	public void deleteRole(Emp_Roles emp) {
		// TODO Auto-generated method stub
		sqlSession.selectOne("EmpRoleControlMapper.deleteRole",emp);
		
	}



}

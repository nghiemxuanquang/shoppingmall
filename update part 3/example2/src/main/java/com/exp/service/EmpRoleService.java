package com.exp.service;


import java.util.List;

import com.exp.model.Emp_Roles;

public interface EmpRoleService {
	public List<Emp_Roles> getRoleList();
	Emp_Roles getRoleByID(int id);
	public void updateRole(Emp_Roles emp);
	public void addNewRole(Emp_Roles emp);
	public void deleteRole(Emp_Roles emp);
}

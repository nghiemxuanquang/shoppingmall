package com.exp.service;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




import com.exp.model.Person;

@Service
public class PersonServiceImp implements PersonService{

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<Person> getPersonList() {
		System.out.println("test");
		// TODO Auto-generated method stub
		
		List<Person> personList = sqlSession.selectList("PersonControlMapper.getPersonList");
		return personList;
		
	}

	@Override
	public Person getPersonByID(int id) {
		// TODO Auto-generated method stub
		Person returnPerson = sqlSession.selectOne("PersonControlMapper.getPersonDetailByID",id);
		return returnPerson;
	}
	
	@Override
	public Person getPersonID(String name)
	{
		Person personID = sqlSession.selectOne("PersonControlMapper.getPersonIDbyPersonName",name);
		return personID;
	}

	@Override
	public void addNewPerson(Person per) {
		// TODO Auto-generated method stub
		sqlSession.insert("PersonControlMapper.insertPerson",per);
	}

	@Override
	public void updatePerson(Person per) {
		// TODO Auto-generated method stub
		sqlSession.update("PersonControlMapper.modifyPerson",per);
	}

	@Override
	public void deletePerson(Person per) {
		// TODO Auto-generated method stub
		sqlSession.selectOne("PersonControlMapper.deletePerson",per);
		
	}

}

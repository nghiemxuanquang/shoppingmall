package com.exp.service;


import java.util.List;

import com.exp.model.Person;


public interface PersonService {
	public List<Person> getPersonList();
	Person getPersonByID(int id);
	public Person getPersonID(String name);
	public void addNewPerson(Person per);
	public void updatePerson(Person per);
	public void deletePerson(Person per);
	
}

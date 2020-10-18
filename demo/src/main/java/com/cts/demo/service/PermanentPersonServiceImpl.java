package com.cts.demo.service;

import java.util.List;

import com.cts.demo.dao.PersonDao;
import com.cts.demo.dao.PersonDaoImpl;
import com.cts.demo.model.Person;

public class PermanentPersonServiceImpl implements PermanentPersonService{

	PersonDao personDao=new PersonDaoImpl();
	@Override
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		
		
		return personDao.getAllPerson();
	}

	@Override
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		return personDao.getPersonById(id);
	}

	@Override
	public Person addPerson(Person person) {
		// TODO Auto-generated method stub
		
		return personDao.addPerson(person);
	}

	@Override
	public Person updatePerson(Person person) {
		// TODO Auto-generated method stub
		return personDao.updatePerson(person);
	}

}

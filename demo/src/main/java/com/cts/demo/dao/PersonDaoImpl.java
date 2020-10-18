package com.cts.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.cts.demo.model.Person;

public class PersonDaoImpl implements PersonDao{

	List<Person> personList=new ArrayList<Person>();
	public List<Person> getAllPerson()
	
	{
		personList.add(new Person(101, "Ram", 25));
		personList.add(new Person(102, "Joy", 30));
		personList.add(new Person(103, "Shyam", 28));
		personList.add(new Person(104, "Sita", 25));	
		return personList;
	}
	@Override
	public Person getPersonById(int id) {
		
		for(Person person:personList) {
			if(person.getId()==id) {
				
				return person;	
			}
		}
		
		return null;
	}
	@Override
	public Person addPerson(Person person) {
		personList.add(person);
		return person;
	}
	@Override
	public Person updatePerson(Person person) {
		int index=0;
		
		for(Person personTemp:personList) {
			
			if(personTemp.getId()==person.getId()) {
				
				
				personList.set(index, person);
				return personTemp;	
			}
			index++;
		}
		
		
			
		return null;
	}

}

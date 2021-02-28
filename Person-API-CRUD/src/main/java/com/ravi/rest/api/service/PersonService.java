package com.ravi.rest.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravi.rest.api.entity.Person;
import com.ravi.rest.api.repository.PersonRepository;
import com.ravi.rest.api.service.exception.ResourceNotFoundException;

@Service
public class PersonService {

	@Autowired
	private PersonRepository repository;

	public Person savePerson(Person person) {
		return repository.save(person);
	}

	public List<Person> savePersons(List<Person> persons) {
		return repository.saveAll(persons);
	}

	public List<Person> getPersons() {
		return repository.findAll();
	}

	public Person getPersonById(long id) {
		return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Record not found with id : " + id));
				
	}
	
	public String deletePerson(long id) {
		repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Record not found with id : " + id));
		repository.deleteById(id);
		return "Person removed !! " + id;
	}

	public Person updatePerson(Person person) {
		Optional<Person> personDb = this.repository.findById(person.getPerson_id());

		if (personDb.isPresent()) {
			Person personUpdate = personDb.get();
			personUpdate.setPerson_id(person.getPerson_id());
			personUpdate.setFirst_name(person.getFirst_name());
			personUpdate.setLast_name(person.getLast_name());
			personUpdate.setAge(person.getAge());
			personUpdate.setFavourite_colour(person.getFavourite_colour());
			repository.save(personUpdate);
			return personUpdate;
		} else {
			throw new ResourceNotFoundException("Record not found with id : " + person.getPerson_id());
		}
	}

}

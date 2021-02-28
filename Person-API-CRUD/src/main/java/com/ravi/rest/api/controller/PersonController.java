package com.ravi.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.rest.api.entity.Person;
import com.ravi.rest.api.service.PersonService;

@RestController
@RequestMapping("/api")
public class PersonController {

	@Autowired
	private PersonService service;

	@PostMapping("/person")
	public Person addPerson(@RequestBody Person person) {
		return service.savePerson(person);
	}

	@PostMapping("/persons")
	public List<Person> addPersons(@RequestBody List<Person> persons) {
		return service.savePersons(persons);
	}

	@GetMapping("/person/{id}")
	public Person findPerson(@PathVariable long id) {
		return service.getPersonById(id);
	}

	@GetMapping("/persons")
	public List<Person> findAllPerson() {
		return service.getPersons();
	}

	@PutMapping("/person/{id}") // NPE
	public Person updatePerson(@PathVariable long id,  @RequestBody Person person) {
		person.setPerson_id(id);
		service.updatePerson(person);
		return person;
	}

	@DeleteMapping("/person/{id}")
	public String deletePerson(@PathVariable long id) {
		return service.deletePerson(id);
	}
}

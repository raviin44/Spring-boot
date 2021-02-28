package com.ravi.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ravi.rest.api.entity.Person;


public interface PersonRepository extends JpaRepository<Person, Long>{
	

}
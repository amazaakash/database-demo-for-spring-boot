package com.example.database.database_demo.jpa;

import org.springframework.stereotype.Repository;

import com.example.database.database_demo.jdbc.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PersonJpaRepository {

	@PersistenceContext
	EntityManager  entityManager;
	
	public Person findbyId() {
		return entityManager.find(Person.class, id);
	}
}

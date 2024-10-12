package com.example.database.database_demo;

import java.util.Date;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import com.example.database.database_demo.jdbc.PersonJdbcDao;
import com.example.database.database_demo.jdbc.entity.Person;
import com.example.database.database_demo.jpa.PersonJpaRepository;


@Repository
public class JPADemoApplication2 implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository jpaRepository;

	public static void main(String[] args) {
		SpringApplication.run(JPADemoApplication2.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//logger.info("All users data ->{}", jdbcDao.findAll());
		logger.info("single user data ->{}", jpaRepository.findbyId());
		/*
		 * logger.info("delete one  user data ->{}", jdbcDao.deletebyID(10003));
		 * logger.info("insert one  user data ->{}", jdbcDao.insert(new Person(10006,
		 * "Muskan", "Induiya", new Date()))); logger.info("update one  user data ->{}",
		 * jdbcDao.update(new Person(10005, "Ravi", "Indore", new Date())));
		 */
	}

}

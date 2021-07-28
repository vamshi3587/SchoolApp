package com.example.v1.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.v1.entity.Student;
import com.example.v1.repository.Repository;

@org.springframework.stereotype.Repository
public class RegistationService {

	@Autowired
	Repository repo;
	
	public String registation(Student student) {
		
		Logger log = LoggerFactory.getLogger(RegistationService.class);
		log.info("Reached to service");
		System.out.println("reached to service"  + student.getStudentAdmissionNumber());
		log.debug("Request {}",student);
		repo.save(student);
		
		return "Student registation Success "  + "Admission number of Student is " + student.getStudentAdmissionNumber();
	}
}

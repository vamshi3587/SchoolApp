package com.example.v1.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.v1.entity.Student;
import com.example.v1.repository.Repository;

@org.springframework.stereotype.Repository
public class RegistationService {

	Logger log = LoggerFactory.getLogger(RegistationService.class);
	@Autowired
	Repository repo;
	
	public String registation(Student student) {
		
		
		log.info("Reached to service");
		System.out.println("reached to service"  + student.getStudentAdmissionNumber());
		log.info("Request {}",student);
		repo.save(student);
		log.info("Student registation Success "  + "Admission number of Student is " + student.getStudentAdmissionNumber());
		
		return "Student registation Success "  + "Admission number of Student is " + student.getStudentAdmissionNumber();
	}
	
	
	public List<Student> getAll(){
		
		log.info("Request to get All user Data");
		
		List<Student> list =repo.findAll();
	
		log.info("Response {}",list);
		return list;
		
	}
}

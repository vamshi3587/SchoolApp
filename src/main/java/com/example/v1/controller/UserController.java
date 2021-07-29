package com.example.v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.v1.entity.Student;
import com.example.v1.service.RegistationService;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/v1")
public class UserController {

	Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	RegistationService service;
	
	@PostMapping("/regist")
	public String register(@RequestBody Student student) {
		System.out.println("enter.....");
		System.out.println(student.getStudentAdmissionNumber());
		log.debug("request {}" , student);
		return service.registation(student);
		
	}
	
	@GetMapping("/hi")
	public List<Student> test() {
		return service.getAll();
	}
	
	@PostMapping("/hi")
	public String post(@RequestBody Student student) {
		 return service.registation(student);
	}
	
}

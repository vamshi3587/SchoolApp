package com.example.v1.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "StudentRegistation")
public class Student {
	

	@Id
	private int studentAdmissionNumber;
	private int studentRollNumber;
	private String studentName;
	private String studentClass;
	
	//@Temporal(TemporalType.DATE)
	private Date studentDOB;
	private String studentDOA;
	private String studentParentName;
	private String studentPhoneNumber;
	
}

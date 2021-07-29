package com.example.v1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Data;

@Data
@Entity
@Table(name = "StudentRegistation")
public class Student {
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int studentAdmissionNumber;
	private int studentRollNumber;
	private String studentName;
	private String studentClass;
	
	@JsonFormat(pattern = "dd-mm-yyyy",shape = Shape.STRING)
	@Column(name="date_of_birth")
	private String studentDOB;
	@JsonFormat(pattern = "dd-mm-yyyy",shape = Shape.STRING)
	@Column(name="date_of_Addmission")
	private String studentDOA;
	private String studentParentName;
	private String studentPhoneNumber;
	
}

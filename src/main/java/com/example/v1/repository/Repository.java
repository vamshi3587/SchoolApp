package com.example.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.v1.entity.Student;

public interface Repository extends JpaRepository<Student, Integer>{

}

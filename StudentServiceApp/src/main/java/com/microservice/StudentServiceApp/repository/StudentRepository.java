package com.microservice.StudentServiceApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.StudentServiceApp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
  
}

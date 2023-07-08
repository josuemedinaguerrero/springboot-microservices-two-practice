package com.microservice.StudentServiceApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.StudentServiceApp.entity.Student;
import com.microservice.StudentServiceApp.repository.StudentRepository;

@Service
public class StudentService {
  
  @Autowired
  private StudentRepository studentRepository;

  public Student getStudentById(Integer id) {
    return studentRepository.findById(id).get();
  }

  public Student insert(Student student) {
    return studentRepository.save(student);
  }

}

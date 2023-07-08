package com.microservice.StudentServiceApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.StudentServiceApp.entity.Student;
import com.microservice.StudentServiceApp.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

  @Autowired
  private StudentService studentService;

  @GetMapping("/{id}")
  public Student getStudentById(@PathVariable Integer id) {
    return studentService.getStudentById(id);
  }

  @PostMapping("/insert")
  public Student insertStudent(@RequestBody Student student) {
    return studentService.insert(student);
  }
  
}

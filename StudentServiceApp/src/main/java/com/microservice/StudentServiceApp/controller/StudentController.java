package com.microservice.StudentServiceApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.StudentServiceApp.entity.Library;
import com.microservice.StudentServiceApp.entity.Student;
import com.microservice.StudentServiceApp.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

  @Autowired
  private StudentService studentService;

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("/{id}")
  public Student getStudentById(@PathVariable Integer id) {
    Library library = restTemplate.getForObject("http://localhost:9090/api/library/" + id, Library.class);
    Student student = studentService.getStudentById(id);
    student.setLibrary(library);
    return student;
  }

  @PostMapping("/insert")
  public Student insertStudent(@RequestBody Student student) {
    return studentService.insert(student);
  }
  
}

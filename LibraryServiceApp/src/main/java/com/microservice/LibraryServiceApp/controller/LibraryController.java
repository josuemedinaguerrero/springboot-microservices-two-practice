package com.microservice.LibraryServiceApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.LibraryServiceApp.entity.Library;
import com.microservice.LibraryServiceApp.service.LibraryService;

@RestController
@RequestMapping("/api/library")
public class LibraryController {
  
  @Autowired
  private LibraryService libraryService;

  @GetMapping("/{id}")
  public Library getLibraryById(@PathVariable Integer id) {
    return libraryService.getBookById(id);
  }

  @PostMapping("/insert")
  public Library insertLibrary(@RequestBody Library library) {
    return libraryService.insertBook(library);
  }

}

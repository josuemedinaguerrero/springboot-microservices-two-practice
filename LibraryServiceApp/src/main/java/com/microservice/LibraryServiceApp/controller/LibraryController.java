package com.microservice.LibraryServiceApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.LibraryServiceApp.entity.Book;
import com.microservice.LibraryServiceApp.entity.Library;
import com.microservice.LibraryServiceApp.service.LibraryService;

@RestController
@RequestMapping("/api/library")
public class LibraryController {
  
  @Autowired
  private LibraryService libraryService;

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("/{id}")
  public Library getLibraryById(@PathVariable Integer id) {
    Book book = restTemplate.getForObject("http://localhost:9092/api/book/" + id, Book.class);
    Library library = libraryService.getLibraryById(id);
    library.setBook(book);
    return library;
  }

  @PostMapping("/insert")
  public Library insertLibrary(@RequestBody Library library) {
    return libraryService.insertLibrary(library);
  }

}

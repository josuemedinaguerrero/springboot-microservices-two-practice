package com.microservice.BookServiceApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.BookServiceApp.entity.Book;
import com.microservice.BookServiceApp.service.BookService;

@RestController
@RequestMapping("/api/book")
public class BookController {
  
  @Autowired
  private BookService bookService;

  @GetMapping("/{id}")
  public Book getBookById(@PathVariable Integer id) {
    return bookService.getBookById(id);
  }

  @PostMapping("/insert")
  public Book insertLibrary(@RequestBody Book book) {
    return bookService.insertBook(book);
  }

}

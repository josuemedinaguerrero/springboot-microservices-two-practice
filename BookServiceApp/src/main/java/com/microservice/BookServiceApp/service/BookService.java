package com.microservice.BookServiceApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.BookServiceApp.entity.Book;
import com.microservice.BookServiceApp.repository.BookRepository;

@Service
public class BookService {
  
  @Autowired
  private BookRepository bookRepository;

  public Book getBookById(Integer id) {
    return bookRepository.findById(id).get();
  }

  public Book insertBook(Book book) {
    return bookRepository.save(book);
  }

}

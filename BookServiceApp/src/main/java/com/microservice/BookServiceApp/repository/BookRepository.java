package com.microservice.BookServiceApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.BookServiceApp.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
  
}

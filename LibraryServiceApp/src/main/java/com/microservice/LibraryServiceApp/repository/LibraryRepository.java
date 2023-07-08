package com.microservice.LibraryServiceApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.LibraryServiceApp.entity.Library;

public interface LibraryRepository extends JpaRepository<Library, Integer> {
  
}

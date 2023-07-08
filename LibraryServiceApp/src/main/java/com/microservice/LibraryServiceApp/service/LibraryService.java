package com.microservice.LibraryServiceApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.LibraryServiceApp.entity.Library;
import com.microservice.LibraryServiceApp.repository.LibraryRepository;

@Service
public class LibraryService {

  @Autowired
  private LibraryRepository libraryRepository;

  public Library getLibraryById(Integer id) {
    return libraryRepository.findById(id).get();
  }

  public Library insertLibrary(Library library) {
    return libraryRepository.save(library);
  }
  
}

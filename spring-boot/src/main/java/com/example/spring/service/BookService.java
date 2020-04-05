package com.example.spring.service;

import java.util.Optional;

import com.example.spring.domain.Book;

public interface BookService {

	Optional<Book> findById(Long id);
}
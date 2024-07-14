package com.lpu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lpu.model.Book;
import com.lpu.repo.BookRepository;

@RestController
public class BookController 
{
	@Autowired
	BookRepository bookRepository;
	
	@GetMapping(value = "/books", produces = "application/json")
	List<Book> getBooks()
	{
		return bookRepository.findAll();
	}
}

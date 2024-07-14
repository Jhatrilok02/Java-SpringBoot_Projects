package com.lpu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lpu.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}

package com.cts.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.books.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}

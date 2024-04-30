package com.example.BookApp.book.service;

import java.util.*;

import com.example.BookApp.book.model.Book;
import org.springframework.stereotype.Service;
import com.example.BookApp.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;



@Service
public class BookService {
    
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

}
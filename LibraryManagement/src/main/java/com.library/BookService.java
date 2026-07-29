package com.library;


public class BookService {

    private BookRepository bookRepository;


    // Setter Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {

        this.bookRepository = bookRepository;

    }


    public void addBook() {

        System.out.println("Book Service called");

        bookRepository.saveBook();

    }

}
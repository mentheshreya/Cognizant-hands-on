package com.library;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LibraryManagementApplication {


    public static void main(String[] args) {


        // Load Spring Container
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "applicationContext.xml");


        // Get BookService Bean
        BookService service =
                context.getBean(
                        "bookService",
                        BookService.class);


        // Call Method
        service.addBook();


    }
}
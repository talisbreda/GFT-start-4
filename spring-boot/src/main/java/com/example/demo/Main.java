package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(MainConfig.class);

        Book book = factory.getBean(Book.class);
        book.setName("Percy Jackson");
        book.setCode("sidjfb");

        Author author = factory.getBean(Author.class);
        author.setName("Rick Riordan");

        book.show();

        ((AbstractApplicationContext) factory).close();
    }
}

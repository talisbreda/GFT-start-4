package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
    private String name;
    private String code;

    @Autowired
    AuthorBook authorBook;

    public AuthorBook getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(AuthorBook authorBook) {
        this.authorBook = authorBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void show() {

        System.out.printf("%s - %s%n", this.name, this.code);
        authorBook.show();
    }
}

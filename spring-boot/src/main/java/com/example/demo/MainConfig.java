package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    @Bean
    public Book getLivro() {
        return new Book();
    }
    // <bean id="book" class="com.springbeans.Book"/>
    @Bean
    public AuthorBook getAuthorBook() {
        return new Author();
    }
}

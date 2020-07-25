package com.study.springbootdemo;

import com.study.springbootdemo.entity.Book;
import com.study.springbootdemo.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDemoApplicationTests {

    @Autowired
    private BookRepository respository;

    @Test
    void contextLoads() {
    }

    @Test
    void save() {
        Book book = new Book();
        book.setName("Spring Boot");
        book.setAuthor("张三");
        Book book1 = respository.save(book);
        System.out.println(book1);
    }

    @Test
    void findById() {

        Book book1 = respository.findById(1).get();
        System.out.println(book1);
    }

    @Test
    void update() {
        Book book = new Book();
        book.setId(1);
        book.setAuthor("张三");
        Book book1 = respository.save(book);
        System.out.println(book1);
    }

    @Test
    void delete() {
        respository.findById(131);
    }
}

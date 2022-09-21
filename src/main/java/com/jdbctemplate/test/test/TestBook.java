package com.jdbctemplate.test.test;

import com.jdbctemplate.test.entity.Book;
import com.jdbctemplate.test.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author hang.yuan
 * @Date 2022/9/21 18:06
 * @Description
 * @Ref
 */
public class TestBook {

    @Test
    public void testJdbcTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean12.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId("1");book.setUsername("java");book.setUststus("done");
        bookService.addBook(book);
    }

}

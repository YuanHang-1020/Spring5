package com.jdbctemplate.test.test;

import com.jdbctemplate.test.entity.Book;
import com.jdbctemplate.test.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author hang.yuan
 * @Date 2022/9/21 18:06
 * @Description
 * @Ref
 */
public class TestBook {

    // 添加
    @Test
    public void testJdbcTemplate1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean12.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId("1");book.setUsername("java");book.setUstatus("done");
//        book.setUserId("2");book.setUsername("python");book.setUstatus("update");
        bookService.addBook(book);
    }

    // 修改
    @Test
    public void testJdbcTemplate2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean12.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId("1");book.setUsername("java");book.setUstatus("update");
        bookService.updateBook(book);
    }

    // 删除
    @Test
    public void testJdbcTemplate3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean12.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        String id = "1";
        bookService.deleteBook(id);
    }

    // 查询单值
    @Test
    public void testJdbcTemplate4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean12.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        int count = bookService.selectCount();
        System.out.println(count);
    }

    // 查询返回对象
    @Test
    public void testJdbcTemplate5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean12.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = bookService.selectObject("1");
        System.out.println(book);
    }

    // 查询返回对象集合
    @Test
    public void testJdbcTemplate6(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean12.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Book> bookList = bookService.selectListObject();
        System.out.println(bookList);
    }

    // 批量添加
    @Test
    public void testJdbcTemplate7(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean12.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3", "C", "done"};batchArgs.add(o1);
        Object[] o2 = {"4", "C++", "update"};batchArgs.add(o2);
        Object[] o3 = {"5", "Rust", "done"};batchArgs.add(o3);
        bookService.batchAdd(batchArgs);
    }

    // 批量修改
    @Test
    public void testJdbcTemplate8(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean12.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"C", "update", "3"};batchArgs.add(o1);
        Object[] o2 = {"C++", "done", "4"};batchArgs.add(o2);
        Object[] o3 = {"Rust", "update", "5"};batchArgs.add(o3);
        bookService.batchUpdate(batchArgs);
    }

    // 批量删除
    @Test
    public void testJdbcTemplate9(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean12.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3"};batchArgs.add(o1);
        Object[] o2 = {"4"};batchArgs.add(o2);
        Object[] o3 = {"5"};batchArgs.add(o3);
        bookService.batchDelete(batchArgs);
    }

}

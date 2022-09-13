package com.spring.test;

import com.spring.Book;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author hang.yuan
 * @Date 2022/9/8 17:40
 * @Description
 * @Ref
 */
public class test01 {

    @Test
    public void testAdd(){

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.TestPrint();

    }

}

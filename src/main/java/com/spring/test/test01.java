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

        Book book1 = context.getBean("book1", Book.class);
        System.out.println(book1);
        book1.TestPrint();

        System.out.println("=========================================");

        Book book2 = context.getBean("book2", Book.class);
        System.out.println(book2);
        book2.TestPrint();

    }

}

package com.spring.collectiontype;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author hang.yuan
 * @Date 2022/9/19 17:11
 * @Description
 * @Ref
 */
public class TestBean {

    @Test
    public void testCollection() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();

    }

    @Test
    public void test() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Book book = context.getBean("book", Book.class);
        book.test();

    }

}

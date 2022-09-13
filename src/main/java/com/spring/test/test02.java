package com.spring.test;

import com.spring.Book;
import com.spring.Order;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author hang.yuan
 * @Date 2022/9/8 18:02
 * @Description
 * @Ref
 */
public class test02 {

    @Test
    public void testAdd(){

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println(order);
        order.TestPrint();

    }

}

package com.spring.service;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author hang.yuan
 * @Date 2022/9/16 16:52
 * @Description
 * @Ref
 */
public class TestBean {

    @Test
    public void testAdd() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();

    }

}

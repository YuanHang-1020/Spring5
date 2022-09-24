package com.transaction.test;

import com.jdbctemplate.service.BookService;
import com.transaction.config.TxConfig;
import com.transaction.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author hang.yuan
 * @Date 2022/9/22 16:27
 * @Description
 * @Ref
 */
public class TestBean {

    // 注解方式
    @Test
    public void testJdbcTemplate1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean13.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    // XML方式
    @Test
    public void testJdbcTemplate2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean14.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    // 完全注解方式
    @Test
    public void testJdbcTemplate3(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    // 函数式风格创建对象
    @Test
    public void testGenericApplicationContext(){
        GenericApplicationContext context = new GenericApplicationContext();
        context.refresh();
        context.registerBean("userService", UserService.class, UserService::new);
        UserService userService = (UserService)context.getBean("userService");
        System.out.println(userService);
    }

}

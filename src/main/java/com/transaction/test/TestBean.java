package com.transaction.test;

import com.jdbctemplate.service.BookService;
import com.transaction.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author hang.yuan
 * @Date 2022/9/22 16:27
 * @Description
 * @Ref
 */
public class TestBean {

    @Test
    public void testJdbcTemplate9(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean13.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

}

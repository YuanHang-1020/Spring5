package com.annotations.testdemo;

import com.annotations.config.SpringConfig;
import com.annotations.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author hang.yuan
 * @Date 2022/9/20 15:22
 * @Description
 * @Ref
 */
public class TestSpringDemo {

    @Test
    public void testService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean9.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }

    // 完全注解
    @Test
    public void testService2() {
        // 加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }

}

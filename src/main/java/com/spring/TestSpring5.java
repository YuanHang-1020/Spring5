package com.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    
    @Test
    public void testAdd() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();

        // 加载对象
        Class<?> name = Class.forName("com.spring.User");
        System.out.println(name);
        // 实例化对象
        User user1 = (User) name.newInstance();
        System.out.println(user1);
    }
    
}

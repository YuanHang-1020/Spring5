package com.aop.annotations;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author hang.yuan
 * @Date 2022/9/21 15:21
 * @Description
 * @Ref
 */
public class TestAop {

    // 配置文件方式
    @Test
    public void testAopAnno(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean10.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    // 完全注解方式
    @Test
    public void testAopAllAnno(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);
        User user = context.getBean("user", User.class);
        user.add();
    }

}

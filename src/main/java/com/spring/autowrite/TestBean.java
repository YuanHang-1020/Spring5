package com.spring.autowrite;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author hang.yuan
 * @Date 2022/9/20 13:41
 * @Description
 * @Ref
 */
public class TestBean {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        Emp emp1 = context.getBean("emp1", Emp.class);
        System.out.println(emp1);
    }

    @Test // 根据名称自动装配
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        Emp emp2 = context.getBean("emp2", Emp.class);
        System.out.println(emp2);
    }


}

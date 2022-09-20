package com.spring.beanlifecycle;

import com.spring.bean.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author hang.yuan
 * @Date 2022/9/20 11:25
 * @Description
 * @Ref
 */
public class TestBean {

    @Test
    public void testAdd() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("4、获取创建bean实例对象");
        System.out.println(orders);

        // 手动让bean实例销毁
        context.close();

    }

}

package com.spring.factorybean;

import com.spring.collectiontype.Course;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author hang.yuan
 * @Date 2022/9/20 10:35
 * @Description
 * @Ref
 */
public class TestBean {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        MyBean myBean = context.getBean("myBean", MyBean.class);
        System.out.println(myBean);
    }

    @Test
    public void testBeanFactory() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }
}

package com.aop.xml;

import com.aop.annotations.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author hang.yuan
 * @Date 2022/9/21 16:37
 * @Description
 * @Ref
 */
public class TestAop {

    @Test
    public void testAopAnno(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean11.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }

}

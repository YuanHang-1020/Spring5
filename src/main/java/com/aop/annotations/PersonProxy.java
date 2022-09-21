package com.aop.annotations;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Order;
import org.springframework.stereotype.Component;

/**
 * @Author hang.yuan
 * @Date 2022/9/21 15:55
 * @Description
 * @Ref
 */
@Component
@Aspect
@Order(1)
public class PersonProxy {

    //前置通知： 在add之前调用
    @Before(value = "execution(* com.aop.annotations.User.add()))") // before()作为前置通知
    public void before(){
        System.out.println("Person before ...");
    }
}

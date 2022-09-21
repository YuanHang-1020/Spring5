package com.aop.annotations;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.junit.jupiter.api.Order;
import org.springframework.stereotype.Component;

/**
 * @Author hang.yuan
 * @Date 2022/9/21 15:10
 * @Description
 * @Ref
 */

@Component
@Aspect
@Order(2)
public class UserProxy {

    //相同切入点抽取
    @Pointcut(value = "execution(* com.aop.annotations.User.add())")
    public void pointcut(){}

    //前置通知： 在add之前调用
    @Before(value = "pointcut()") // before()作为前置通知
    public void before(){
        System.out.println("before ...");
    }

    //返回通知(后置通知)
    @AfterReturning(value = "pointcut()")
    public void afterReturning(){
        System.out.println("afterReturning ...");
    }

    //异常通知
    @AfterThrowing(value = "pointcut()")
    public void afterThrowing(){
        System.out.println("afterThrowing ...");
    }

    //最终通知： 在add之后调用
    @After(value = "pointcut()") // after()作为最终通知
    public void after(){
        System.out.println("after ...");
    }

    //环绕通知
    @Around(value = "pointcut()") // around()作为环绕通知
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Before around ...");

        // 被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("After around ...");
    }


}

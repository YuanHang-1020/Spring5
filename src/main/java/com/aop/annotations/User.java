package com.aop.annotations;

import org.springframework.stereotype.Component;

/**
 * @Author hang.yuan
 * @Date 2022/9/21 15:09
 * @Description
 * @Ref
 */

@Component
public class User {
    public void add(){
//        int i = 20 / 0;
        System.out.println("add ...");
    }
}

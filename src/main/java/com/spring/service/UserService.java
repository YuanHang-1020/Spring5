package com.spring.service;

import com.spring.dao.UserDao;
import com.spring.dao.UserDaoImpl;

/**
 * @Author hang.yuan
 * @Date 2022/9/16 16:30
 * @Description
 * @Ref
 */
public class UserService {

    // 创建UserDao类型属性，生成set方法
    private UserDao userDao2;

    public void setUserDao(UserDao userDao) {
        this.userDao2 = userDao;
    }

    public void add() {
        System.out.println("service add ......");
        // 传统方式
//        UserDao userDao1 = new UserDaoImpl();
//        userDao1.update();

        userDao2.update();

    }
}

package com.annotations.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author hang.yuan
 * @Date 2022/9/20 15:51
 * @Description
 * @Ref
 */
@Repository(value = "userDaoImpl")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao add ......");
    }
}

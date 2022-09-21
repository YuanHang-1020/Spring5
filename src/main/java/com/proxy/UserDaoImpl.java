package com.proxy;

/**
 * @Author hang.yuan
 * @Date 2022/9/21 13:57
 * @Description
 * @Ref
 */
public class UserDaoImpl implements UserDao{


    @Override
    public int add(int a, int b) {
        System.out.println("begain to run add ... ");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("begain to run update ... ");
        return id;
    }

    @Override
    public String toString() {
        return UserDaoImpl.class.getName();
    }
}

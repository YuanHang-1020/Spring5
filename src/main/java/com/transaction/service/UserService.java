package com.transaction.service;

import com.transaction.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author hang.yuan
 * @Date 2022/9/22 16:16
 * @Description
 * @Ref
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void accountMoney(){

        // step 1
        // step 2
        // step 3
        // step 4

        userDao.reduceMoney();

        // 模拟异常
        int i = 100 / 0;

        userDao.addMoney();
    }

}

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

        try{

            // step 1 开启事务

            // step 2 业务逻辑
            userDao.reduceMoney();
            // 模拟异常
            // int i = 100 / 0;
            userDao.addMoney();

            // step 3 未发生异常，提交事务

        }catch (Exception e){
            // step 4 出现异常、事务回滚
        }

    }

}

package com.transaction.service;

import com.transaction.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author hang.yuan
 * @Date 2022/9/22 16:16
 * @Description
 * @Ref
 */
@Service
@Transactional(readOnly = false, timeout = -1,propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ) // 是否只读 超时时间 传播行为（解决多事务方法之间的事务管理） 隔离级别（解决脏读、不可重复读、幻读的问题）
public class UserService {

    @Autowired
    private UserDao userDao;

    public void accountMoney(){

//        try{

            // step 1 开启事务

            // step 2 业务逻辑
            userDao.reduceMoney();
            // 模拟异常
//             int i = 100 / 0;
            userDao.addMoney();

            // step 3 未发生异常，提交事务

//        }catch (Exception e){
            // step 4 出现异常、事务回滚
//        }

    }

}

package com.transaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author hang.yuan
 * @Date 2022/9/22 16:17
 * @Description
 * @Ref
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void reduceMoney() {
        String sql = "update account set money = money - ? where username = ?";
        int update = jdbcTemplate.update(sql,100,"lucy");
        System.out.println(update);
    }

    @Override
    public void addMoney() {
        String sql = "update account set money = money + ? where username = ?";
        int update = jdbcTemplate.update(sql, 100, "mary");
        System.out.println(update);
    }
}

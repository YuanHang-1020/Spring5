package com.jdbctemplate.test.dao;

import com.jdbctemplate.test.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author hang.yuan
 * @Date 2022/9/21 17:47
 * @Description
 * @Ref
 */
@Repository
public class BookDaoImpl implements BookDao {

    // 注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void add(Book book) {

        String sql = "insert into book values(?,?,?)";

        int update = jdbcTemplate.update(sql, book.getUserId(), book.getUsername(), book.getUststus());
        System.out.println(update);
    }
}

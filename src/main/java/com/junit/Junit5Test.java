package com.junit;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @Author hang.yuan
 * @Date 2022/9/23 13:36
 * @Description
 * @Ref
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:bean14.xml")
public class Junit5Test {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void junitTest() {
        System.out.println(jdbcTemplate);
    }

}

package com.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author hang.yuan
 * @Date 2022/9/23 13:28
 * @Description
 * @Ref
 */
@RunWith(SpringJUnit4ClassRunner.class)           // 单元测试框架
@ContextConfiguration("classpath:bean14.xml")     // 加载配置文件
public class Junit4Test {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void junitTest() {
        System.out.println(jdbcTemplate);
    }

}

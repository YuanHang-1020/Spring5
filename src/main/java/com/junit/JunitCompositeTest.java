package com.junit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Author hang.yuan
 * @Date 2022/9/23 13:51
 * @Description
 * @Ref
 */
@SpringJUnitConfig(locations = "classpath:bean14.xml")  // 复合注解
public class JunitCompositeTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void junitTest() {
        System.out.println(jdbcTemplate);
    }

}

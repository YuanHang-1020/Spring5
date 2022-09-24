package com.transaction.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * @Author hang.yuan
 * @Date 2022/9/23 10:45
 * @Description
 * @Ref
 */
@Configuration
@ComponentScan(basePackages = "com.transaction")   // 组件扫描
@EnableTransactionManagement                       // 开启事务
public class TxConfig {

    // 创建数据库连接池
    @Bean
    public DruidDataSource getDruidDataSource() throws IOException {
        Properties properties = new Properties();
        properties.load(new BufferedInputStream(Files.newInputStream(Paths.get("src/main/resources/jdbc.properties"))));
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(properties.getProperty("prop.driverClass"));
        dataSource.setUrl(properties.getProperty("prop.url"));
        dataSource.setUsername(properties.getProperty("prop.userName"));
        dataSource.setPassword(properties.getProperty("prop.passWord"));
        return dataSource;
    }

    // 创建JdbcTemplate对象
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        // 在IOC容器中找到dataSource
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        // 注入dataSource
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    // 创建事务管理器对象
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }


}

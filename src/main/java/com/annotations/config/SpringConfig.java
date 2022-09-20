package com.annotations.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author hang.yuan
 * @Date 2022/9/20 16:36
 * @Description 完全注解
 * @Ref
 */
@Configuration // 作为配置类，替代xml文件配置
@ComponentScan(basePackages = {"com.annotations"})
public class SpringConfig {
}

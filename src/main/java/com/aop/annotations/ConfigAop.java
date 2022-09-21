package com.aop.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author hang.yuan
 * @Date 2022/9/21 17:11
 * @Description
 * @Ref
 */
@Configuration
@ComponentScan(basePackages = {"com.aop.annotations"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}

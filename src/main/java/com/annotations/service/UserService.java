package com.annotations.service;

import com.annotations.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author hang.yuan
 * @Date 2022/9/20 15:19
 * @Description
 * @Ref
 */
//@Repository  @Component  @Service  @Controller 功能一致,层次分明

// value 可以省略，默认为类名，首字母小写
@Component(value = "userService") // <bean id="userService" class="com.annotations.service.UserService"/>
public class UserService {

    // 无需set方法，添加注解@Autowired，根据类型进行注入
//    @Autowired
//    @Qualifier(value = "userDaoImpl") // 根据名称进行注入

    @Resource(name = "userDaoImpl") // 根据名称进行注入 javax.annotation.Resource 是java扩展中的包，不建议使用
    private UserDao userDao ;


    @Value(value = "abc") // 普通类型的属性注入
    private String name;


    public void add() {
        System.out.println("service add ......");
        userDao.add();
        System.out.println(name);
    }

}

package com.spring.factorybean;

import com.spring.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author hang.yuan
 * @Date 2022/9/20 10:33
 * @Description
 * @Ref
 */
public class MyBean implements FactoryBean<Course> {

    // 定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setName("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}

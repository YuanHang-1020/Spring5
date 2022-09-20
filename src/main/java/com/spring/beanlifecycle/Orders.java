package com.spring.beanlifecycle;

/**
 * @Author hang.yuan
 * @Date 2022/9/20 11:19
 * @Description
 * @Ref
 */
public class Orders {

    private String name;

    public Orders() {
        System.out.println("1、执行无参构造，创建bean实例");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2、调用set方法是指属性值");
    }

    //创建执行初始化方法
    public void initMethod(){
        System.out.println("3、执行初始化方法");
    }

    //创建执行销毁方法
    public void destoryMethod(){
        System.out.println("5、执行销毁方法");
    }

}

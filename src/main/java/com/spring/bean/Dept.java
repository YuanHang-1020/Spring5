package com.spring.bean;

/**
 * @Author hang.yuan
 * @Date 2022/9/19 15:32
 * @Description
 * @Ref
 */
public class Dept {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

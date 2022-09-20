package com.spring.collectiontype;

/**
 * @Author hang.yuan
 * @Date 2022/9/19 17:33
 * @Description
 * @Ref
 */
public class Course {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

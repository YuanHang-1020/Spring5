package com.spring.bean;

/**
 * @Author hang.yuan
 * @Date 2022/9/19 15:33
 * @Description
 * @Ref
 */
public class Emp {

    private String name;
    private String gender;
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void add() {
        System.out.println(name + " is " + gender + " from " + dept);
    }

}

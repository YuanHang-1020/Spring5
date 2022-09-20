package com.spring.autowrite;

/**
 * @Author hang.yuan
 * @Date 2022/9/20 13:38
 * @Description
 * @Ref
 */
public class Emp {

    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test(){
        System.out.println(dept);
    }
}

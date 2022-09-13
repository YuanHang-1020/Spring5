package com.spring;

/**
 * @Author hang.yuan
 * @Date 2022/9/8 17:37
 * @Description
 * @Ref
 */
public class Book {

    private String bname;
    private String bauther;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauther(String bauther) {
        this.bauther = bauther;
    }
    public void TestPrint(){
        System.out.println("bname: " +bname + ":::" + "bauther: " + bauther);
    }
}

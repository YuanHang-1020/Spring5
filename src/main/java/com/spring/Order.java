package com.spring;

/**
 * @Author hang.yuan
 * @Date 2022/9/8 18:01
 * @Description
 * @Ref
 */
public class Order {

    private String oname;
    private String address;

    public Order(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void TestPrint(){
        System.out.println("oname: " +oname + ":::" + "address: " + address);
    }
}

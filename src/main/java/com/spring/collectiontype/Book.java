package com.spring.collectiontype;

import java.util.List;

/**
 * @Author hang.yuan
 * @Date 2022/9/19 17:56
 * @Description
 * @Ref
 */
public class Book {

    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test(){
        System.out.println(list);
    }
}

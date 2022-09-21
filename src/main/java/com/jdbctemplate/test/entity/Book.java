package com.jdbctemplate.test.entity;

/**
 * @Author hang.yuan
 * @Date 2022/9/21 17:54
 * @Description
 * @Ref
 */
public class Book {

    private String userId;
    private String username;
    private String uststus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUststus() {
        return uststus;
    }

    public void setUststus(String uststus) {
        this.uststus = uststus;
    }
}

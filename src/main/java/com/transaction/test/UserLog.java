package com.transaction.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author hang.yuan
 * @Date 2022/9/23 13:08
 * @Description
 * @Ref
 */
public class UserLog {

    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {

        log.info("hello log4j2");
        log.warn("hello log4j2");

    }

}

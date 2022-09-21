package com.jdbctemplate.test.service;


import com.jdbctemplate.test.dao.BookDao;
import com.jdbctemplate.test.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author hang.yuan
 * @Date 2022/9/21 17:47
 * @Description
 * @Ref
 */
@Service
public class BookService {

    // 注入dao
    @Autowired
    private BookDao bookDao;

    // 添加方法
    public void addBook(Book book){
        bookDao.add(book);
    }


}

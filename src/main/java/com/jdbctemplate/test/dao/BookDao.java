package com.jdbctemplate.test.dao;

import com.jdbctemplate.test.entity.Book;

import java.util.List;

/**
 * @Author hang.yuan
 * @Date 2022/9/21 17:47
 * @Description
 * @Ref
 */
public interface BookDao {

    void add(Book book);

    void updateBook(Book book);

    void deleteBook(String id);

    int selectCount();

    Book selectObject(String id);

    List<Book> selectListObject();

    void batchAddBook(List<Object[]> batchArgs);

    void batchUpdateBook(List<Object[]> batchArgs);

    void batchDeleteBook(List<Object[]> batchArgs);
}

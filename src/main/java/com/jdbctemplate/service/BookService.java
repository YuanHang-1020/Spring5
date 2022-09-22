package com.jdbctemplate.service;


import com.jdbctemplate.dao.BookDao;
import com.jdbctemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    // 修改方法
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    // 删除方法
    public void deleteBook(String id){
        bookDao.deleteBook(id);
    }

    // 查询单值
    public int selectCount() {
        return bookDao.selectCount();
    }

    // 查询返回对象
    public Book selectObject(String id) {
        return bookDao.selectObject(id);
    }

    // 查询返回集合对象
    public List<Book> selectListObject() {
        return bookDao.selectListObject();
    }

    // 批量添加
    public void batchAdd(List<Object[]> batchArgs) {
        bookDao.batchAddBook(batchArgs);
    }

    // 批量修改
    public void batchUpdate(List<Object[]> batchArgs) {
        bookDao.batchUpdateBook(batchArgs);
    }

    // 批量删除
    public void batchDelete(List<Object[]> batchArgs) {
        bookDao.batchDeleteBook(batchArgs);
    }



}

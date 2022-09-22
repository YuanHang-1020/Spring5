package com.jdbctemplate.dao;

import com.jdbctemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @Author hang.yuan
 * @Date 2022/9/21 17:47
 * @Description
 * @Ref
 */
@Repository
public class BookDaoImpl implements BookDao {

    // 注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void add(Book book) {

        String sql = "insert into book values(?,?,?)";
        int update = jdbcTemplate.update(sql, book.getUserId(), book.getUsername(), book.getUststus());
        System.out.println(update);

    }

    @Override
    public void updateBook(Book book) {

        String sql = "update book set username=?,ustatus=? where user_id=?";
        int update = jdbcTemplate.update(sql, book.getUsername(), book.getUststus(), book.getUserId());
        System.out.println(update);

    }

    @Override
    public void deleteBook(String id) {

        String sql = "delete from  book where user_id=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);

    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public Book selectObject(String id) {
        String sql = "select * from book where user_id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    @Override
    public List<Book> selectListObject() {
        String sql = "select * from book";
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }

    @Override
    public void batchAddBook(List<Object[]> batchArgs) {

        String sql = "insert into book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));

    }

    @Override
    public void batchUpdateBook(List<Object[]> batchArgs) {

        String sql = "update book set username=?,ustatus=? where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));

    }

    @Override
    public void batchDeleteBook(List<Object[]> batchArgs) {

        String sql = "delete from book where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));

    }
}

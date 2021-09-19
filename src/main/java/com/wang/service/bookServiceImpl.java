package com.wang.service;

import com.wang.dao.bookMapper;
import com.wang.pojo.Books;
import java.util.List;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/15 0015
 */
public class bookServiceImpl implements bookService
{
    //service层调dao层
    private com.wang.dao.bookMapper bookMapper;

    public void setBookMapper(bookMapper bookMapper)
    {
        this.bookMapper = bookMapper;
    }

    @Override

    public int addBook(Books books)
    {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookByID(int id)
    {
        return bookMapper.deleteBookByID(id);
    }

    @Override
    public int updateBook(Books books)
    {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryByID(int id)
    {
        return bookMapper.queryByID(id);
    }

    @Override
    public List <Books> queryAll()
    {
        return bookMapper.queryAll();
    }

    @Override
    public Books queryBookByName(String bookName)
    {
        return bookMapper.queryBookByName(bookName);
    }
}

package com.wang.dao;

import com.wang.pojo.Books;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/15 0015
 */

public interface bookMapper
{
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookByID(@Param("bookID") int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryByID(int id);

    //查询全部shushu
    List <Books> queryAll();
}
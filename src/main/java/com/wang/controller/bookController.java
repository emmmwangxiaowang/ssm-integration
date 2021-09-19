package com.wang.controller;

import com.wang.pojo.Books;
import com.wang.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/15 0015
 */

@Controller
@RequestMapping("/book")
public class bookController
{
    //controller调service
    @Autowired
    @Qualifier("bookServiceImpl")
    private bookService bookService;

    //查询全部书籍,并返回一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model)
    {
        List <Books> list = bookService.queryAll();
        model.addAttribute("list", list);
        return "allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPage()
    {

        return "addBook";
    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books)
    {
        System.out.println("addBook==" + books);
        bookService.addBook(books);

        return "redirect:/book/allBook";
    }

    //跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdatePage(int id, Model model)
    {
        Books books = bookService.queryByID(id);
        model.addAttribute("queryBook", books);
        return "updateBook";
    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books)
    {
        System.out.println("=========" + books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    //删除书籍
    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBoot(@PathVariable("bookID") int id)
    {
        bookService.deleteBookByID(id);
        return "redirect:/book/allBook";
    }
}

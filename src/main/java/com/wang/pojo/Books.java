package com.wang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/15 0015
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books
{
    private int    bookID;
    private String bookName;
    private int    bookCounts;
    private String detail;
}

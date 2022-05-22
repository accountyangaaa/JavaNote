package com.company.operation;

import com.company.book.BookList;

/**
 * @program: Library
 * @description:
 * @author: Mrs.Yang
 * @create: 2022-05-05 19:46
 **/
public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统！");
        System.exit(0);//0，正常退出
    }
}

package com.company.user;

import com.company.book.BookList;
import com.company.operation.IOperation;

/**
 * @program: Library
 * @description:用户类
 * @author: Mrs.Yang
 * @create: 2022-05-05 19:52
 **/
abstract public class User {
    protected String name;
    protected IOperation[] iOperations;

    public User(String name){
        this.name = name;
    }
    //显示菜单
    public abstract int menu();
    //根据用户选项执行操作
    abstract public void doWork(int choice, BookList bookList);
}

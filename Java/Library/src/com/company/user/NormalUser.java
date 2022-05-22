package com.company.user;

import com.company.book.BookList;
import com.company.operation.*;

import java.util.Scanner;

/**
 * @program: Library
 * @description: 普通用户类
 * @author: Mrs.Yang
 * @create: 2022-05-05 19:56
 **/
public class NormalUser extends User{
    public NormalUser(String name){
        super(name);
        this.iOperations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    @Override
    public void doWork(int choice, BookList bookList) {
        iOperations[choice].work(bookList);
    }

    @Override
    public int menu() {
        System.out.println("==============普通用户菜单=====================");
        System.out.println("Hello " + this.name + ", 欢迎使用图书管理系统！");
        System.out.println("1. 查找图书");
        System.out.println("2. 借阅图书");
        System.out.println("3. 归还图书");
        System.out.println("0. 退出系统");
        System.out.println("====================================");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}

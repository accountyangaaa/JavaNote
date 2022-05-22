package com.company.user;

import com.company.book.BookList;
import com.company.operation.*;

import java.util.Scanner;

/**
 * @program: Library
 * @description: 管理员用户类
 * @author: Mrs.Yang
 * @create: 2022-05-05 20:06
 **/
public class Admin extends User {
    public Admin(String name){
        super(name);
        this.iOperations = new IOperation[]{ //初始化
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }

    @Override
    public void doWork(int choice, BookList bookList) {
        iOperations[choice].work(bookList);
    }

    @Override
    public int menu() {
        System.out.println("==============管理员菜单=====================");
        System.out.println("Hello " + this.name + ", 欢迎使用图书管理系统！");
        System.out.println("1. 查找图书");
        System.out.println("2. 新增图书");
        System.out.println("3. 删除图书");
        System.out.println("4. 显示所有图书");
        System.out.println("0. 退出系统");
        System.out.println("====================================");
        System.out.println("请输入您的选择： ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        return choice;
    }
}

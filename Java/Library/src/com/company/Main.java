package com.company;

import com.company.book.BookList;
import com.company.user.Admin;
import com.company.user.NormalUser;
import com.company.user.User;

import java.util.Scanner;

/**
 * 整个程序的入口地方
 */
public class Main {

    public static void main(String[] args) {
	    //1. 准备基本的数据
        BookList bookList = new BookList();
        //2. 创建用户
        User user = login(); //这个user引用 会引用哪个对象，就取决于你返回哪个对象 向上转型
        //3.进入主循环
        while (true){
            int choice = user.menu(); //发生了动态绑定-》多态
            //根据你的choice
            user.doWork(choice, bookList);
        }

    }

    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入您的身份（1 表示管理员， 0 表示普通用户）：");
        int choice = scanner.nextInt();
        if (choice == 1){
            return new Admin(name);
        }
        return new NormalUser(name);
    }
}

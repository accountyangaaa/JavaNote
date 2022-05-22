package com.company.operation;

import com.company.book.Book;
import com.company.book.BookList;

import java.util.Scanner;

/**
 * @program: Library
 * @description: 默认放到数组的最后一个
 * @author: Mrs.Yang
 * @create: 2022-05-05 19:44
 **/
public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {

        System.out.println("新增图书！");
        //Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书名字：");
        String name = scanner.nextLine();
        System.out.println("请输入图书作者：");
        String author = scanner.nextLine();
        System.out.println("请输入图书类型：");
        String type = scanner.nextLine();
        System.out.println("请输入图书价格：");
        int price = scanner.nextInt();

        Book book = new Book(name, author, price, type);
        int usedSize = bookList.getUsedSize();
        bookList.setBooks(usedSize, book);
        usedSize = usedSize + 1;
        bookList.setUsedSize(usedSize);
        //

        System.out.println("新增图书成功！");

    }
}

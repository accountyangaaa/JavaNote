package com.company.operation;

import com.company.book.Book;
import com.company.book.BookList;

/**
 * @program: Library
 * @description:
 * @author: Mrs.Yang
 * @create: 2022-05-05 19:45
 **/
public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书！");
        System.out.println("请输入要借阅的图书名字：");
        String name = scanner.nextLine();
        int size = bookList.getUsedSize();
        for (int i = 0; i < size; i++){
            Book book = bookList.getPos(i);
            if (name.equals(book.getName())){//字符串比较
                book.setBorrowed(true);
                System.out.println("借阅成功，信息如下：");
                System.out.println(book);
                return;
            }
        }
        System.out.println("未找到你要借阅的这本书！");
    }
}

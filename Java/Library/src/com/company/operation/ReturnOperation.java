package com.company.operation;

import com.company.book.Book;
import com.company.book.BookList;

/**
 * @program: Library
 * @description:
 * @author: Mrs.Yang
 * @create: 2022-05-05 19:45
 **/
public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书！");
        System.out.println("请输入要归还的图书名字：");
        String name = scanner.nextLine();
        int size = bookList.getUsedSize();
        for (int i = 0; i < size; i++){
            Book book = bookList.getPos(i);
            if (name.equals(book.getName())){//字符串比较
                book.setBorrowed(false);
                System.out.println("归还成功，信息如下：");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有你要归还的这本书！");
    }
}

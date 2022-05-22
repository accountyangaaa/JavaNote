package com.company.operation;

import com.company.book.Book;
import com.company.book.BookList;

/**
 * @program: Library
 * @description:
 * @author: Mrs.Yang
 * @create: 2022-05-05 19:45
 **/
public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("打印图书！");
        int usedSize = bookList.getUsedSize();
        for (int i = 0; i<usedSize; i++){
            Book book = bookList.getPos(i);
            System.out.println(book);
        }
    }
}

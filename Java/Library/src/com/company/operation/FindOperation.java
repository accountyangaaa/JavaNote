package com.company.operation;

import com.company.book.Book;
import com.company.book.BookList;

/**
 * @program: Library
 * @description:
 * @author: Mrs.Yang
 * @create: 2022-05-05 19:44
 **/
public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书！");
        System.out.println("请输入要查找的图书名字：");
        String name = scanner.nextLine();
        int size = bookList.getUsedSize();
        for (int i = 0; i < size; i++){
            Book book = bookList.getPos(i);
            if (name.equals(book.getName())){//字符串比较
                System.out.println("找到了这本书，信息如下：");
                System.out.println(book);
                return;
            }
        }
        System.out.println("未找到这本书！");
    }
}

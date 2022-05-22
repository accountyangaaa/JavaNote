package com.company.operation;

import com.company.book.Book;
import com.company.book.BookList;

/**
 * @program: Library
 * @description:
 * @author: Mrs.Yang
 * @create: 2022-05-05 19:44
 **/
public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书！");
        //1.根据书名找到书的位置
        System.out.println("请输入要删除的图书名字：");
        String name = scanner.nextLine();
        int size = bookList.getUsedSize();
        int index = 0;//存储找到的书籍下标
        int i = 0;
        for (i = 0; i < size; i++){
            Book book = bookList.getPos(i);
            if (name.equals(book.getName())){//字符串比较
                break;
            }
            index = i;
        }
        if (i >= size){
            System.out.println("没有你要删除的这本书！");
        }
        //2.进行删除
        for (int j = index; j < size-1; j++){
            //bookList[j] = bookList[j+1]
            Book book = bookList.getPos(j+1);
            bookList.setBooks(j,book);
        }
        bookList.setBooks(size,null);
        bookList.setUsedSize(size-1);
        System.out.println("删除成功！");
    }
}

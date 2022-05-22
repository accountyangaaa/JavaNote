package com.company.book;

import java.util.Arrays;

/**
 * @program: Library
 * @description: 保存n本书
 * @author: Mrs.Yang
 * @create: 2022-05-05 19:37
 **/
public class BookList {
    private Book[] books = new Book[10];
    private int usedSize = 0;

    //弄几个初始值，方便后续测试
    public BookList() {
        books[0] = new Book("三国演义", "罗贯中", 100, "小说");
        books[1] = new Book("水浒传", "施耐庵", 100, "小说");
        books[2] = new Book("西游记", "吴承恩", 100, "小说");
        this.usedSize = 3;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    /**
     * 获取到pos位置的一本书
     * @param pos
     * @return
     */
    public Book getPos(int pos){
        return this.books[pos];
    }

    /**
     * 设置pos下标为一本书，添加一本书
     * @param pos
     * @param book
     */
    public void setBooks(int pos, Book book) {
        books[pos] = book;
    }

}

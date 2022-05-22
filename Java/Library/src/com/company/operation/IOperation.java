package com.company.operation;

import com.company.book.BookList;

import java.util.Scanner;

public interface IOperation {
    Scanner scanner = new Scanner(System.in);
    void work(BookList bookList);
}

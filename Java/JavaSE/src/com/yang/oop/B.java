package com.yang.oop;

/**
 * @program: JavaSE
 * @description: 有坑的代码构造方法中调用重写的方法
 * @author: Mrs.Yang
 * @create: 2022-05-03 17:26
 **/
public class B {
    public B(){
        //do nothing
        //func();
    }

    public void func(){
        System.out.println("B.func()");
    }
}

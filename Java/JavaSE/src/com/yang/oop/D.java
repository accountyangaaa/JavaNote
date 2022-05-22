package com.yang.oop;

/**
 * @program: JavaSE
 * @description: 构造方法中调用重写方法
 * @author: Mrs.Yang
 * @create: 2022-05-03 17:27
 **/
public class D extends B {
    private int num = 1;
    public D(){

    }
    @Override
    public void func() {
        System.out.println("D.func() " + num);
    }
}

package com.yang.oop1;

import com.yang.oop.Animal;
import com.yang.oop.Demo1;

/**
 * @program: JavaSE
 * @description:
 * @author: Mrs.Yang
 * @create: 2022-04-29 17:33
 **/
public class Test {
    public static void main(String[] args) {
        //Animal animal = new Animal("小动物");
       // System.out.println(animal.name);//编译出错，无法访问name
        final int a = 10;
        //a = 20;//Error:(17, 9) java: 无法为最终变量a分配值
    }
}

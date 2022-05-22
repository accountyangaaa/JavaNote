package com.yang.oop1;

import com.yang.oop.Animal;

/**
 * @program: JavaSE
 * @description:
 * @author: Mrs.Yang
 * @create: 2022-05-03 12:19
 **/
public class Bird extends Animal{
    public Bird(String name){
        //super(name);
        //this.name = name;
    }

    public void fly(){
        //对于父类的protected字段，子类可以正确访问
        //System.out.println(this.name + "正在飞");
    }
}

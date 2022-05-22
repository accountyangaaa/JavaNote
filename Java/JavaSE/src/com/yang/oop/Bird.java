package com.yang.oop;

/**
 * @program: JavaSE
 * @description: 鸟
 * @author: Mrs.Yang
 * @create: 2022-04-29 17:47
 **/
public class Bird extends Animal{
    public Bird(String name){
        //super(name);
       //this.name = name;
    }


    public void eat(String food) {
        //修改代码。让子类调用父类的接口
        //super.eat(food);
        System.out.println("我是一只小鸟");
        //System.out.println(this.name + "正在吃" + food);
    }

    public void fly(){
        //对于父类的protected字段，子类可以正确访问
        //System.out.println(this.name + "正在飞");
    }
}


package com.yang.oop;

/**
 * @program: JavaSE
 * @description: 猫
 * @author: Mrs.Yang
 * @create: 2022-04-29 17:45
 **/
public class Cat extends Animal implements IRunning{

    public Cat(String name){
        //使用super调用父类的构造方法
        //super(name);
    }

    @Override
    public void run() {
        //System.out.println(this.name + "正在用四条腿跑");
    }
}

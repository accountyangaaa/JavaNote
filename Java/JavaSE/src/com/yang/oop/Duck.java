package com.yang.oop;

/**
 * @program: JavaSE
 * @description:
 * @author: Mrs.Yang
 * @create: 2022-05-03 18:36
 **/
public class Duck extends Animal implements IRunning,ISwimming,IFlying {
    public Duck(String name){
        //super(name);
    }

    @Override
    public void fly() {
        //System.out.println(this.name +"正在用翅膀飞");
    }

    @Override
    public void run() {
       //System.out.println(this.name + "正在用两条腿跑");
    }

    @Override
    public void swim() {
        //System.out.println(this.name + "正在漂在水上");
    }
}

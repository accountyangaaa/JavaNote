package com.yang.oop;

/**
 * @program: JavaSE
 * @description:
 * @author: Mrs.Yang
 * @create: 2022-05-03 18:32
 **/
public class Fish extends Animal implements ISwimming {
    public Fish(String name){
        //super(name);
    }

    @Override
    public void swim() {
        //System.out.println(this.name + "正在用尾巴游泳");
    }
}

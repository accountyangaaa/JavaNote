package com.yang.oop;

/**
 * @program: JavaSE
 * @description:
 * @author: Mrs.Yang
 * @create: 2022-05-03 18:53
 **/
public class Robot implements IRunning {
    private String name;
    public Robot(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在用轮子跑");
    }
}

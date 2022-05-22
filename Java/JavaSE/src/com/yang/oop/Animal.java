package com.yang.oop;

/**
 * @program: JavaSE
 * @description: 动物父类
 * @author: Mrs.Yang
 * @create: 2022-04-29 17:44
 **/
public class Animal implements Cloneable{
    private String name;

    @Override
    public Animal clone(){
        Animal o = null;
        try {
            o = (Animal)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return o;
    }
}


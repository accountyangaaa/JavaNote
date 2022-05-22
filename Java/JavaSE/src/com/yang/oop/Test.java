package com.yang.oop;

import java.io.File;
import java.util.Arrays;

/**
 * @program: JavaSE
 * @description: 面向对象编程，Clonable接口
 * 创建对象的方式：
 * 1.new
 * 2.clone（）
 * 一个对象要被克隆先实现Clonable接口，再重写Object clone（）方法，最后调用clone（）方法，
 * 还得抛出异常throws CloneNotSupportedException
 * @author: Mrs.Yang
 * @create: 2022-04-29 17:25
 **/

class Money implements Cloneable{
        public double m = 12.5;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
    class Person implements Cloneable{
        public int age;
        public Money money = new Money();

        public void eat(){
            System.out.println("吃！");
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    '}';
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Person tmp = (Person) super.clone();
            tmp.money = (Money)this.money.clone();
            return tmp;
            //return super.clone();
        }
    }
    public class Test {

        public static void main(String[] args) throws CloneNotSupportedException{
            Person person = new Person();
            Person person1 = (Person) person.clone();
            System.out.println(person.money.m);
            System.out.println(person1.money.m);
            System.out.println("===========================");
            person1.money.m = 99.99;
            System.out.println(person.money.m);
            System.out.println(person1.money.m);

        }
    public static void main1(String[] args) throws CloneNotSupportedException{
        Person person = new Person();
        person.age = 99;

        Person person1 = (Person) person.clone();
        System.out.println(person1);

        System.out.println("==================");
        person1.age = 199;
        System.out.println(person);
        System.out.println(person1);
    }
}

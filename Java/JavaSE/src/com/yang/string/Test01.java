package com.yang.string;

import java.util.Arrays;

/**
 * @program: JavaSE
 * @description: 认识String类
 * @author: Mrs.Yang
 * @create: 2022-05-07 16:26
 **/
public class Test01 {

    public static void func2(String s){
        //字符串传参的时候要注意
        if (s == null || s.length() == 0){

        }

        /**下面的会引发空指针异常
         * Exception in thread "main" java.lang.NullPointerException
         * 	at com.yang.string.Test.func2(Test.java:19)
         * 	at com.yang.string.Test.main(Test.java:29)
         */
        if (s.length() == 0 || s == null){

        }

    }

    public static void main(String[] args) {


        String str1 = null;//str1这个引用 不指向任何对象
        func2(str1);
        String str2 = "";//str2这个引用 指向的字符串是空的



    }

    public static void main10(String[] args) {
        //数组的整体赋值  只有一次机会 就是在定义的时候
        int[] array = {1,2,3,4,5};
        //array = {4,5,6,7,8};

        //final修饰的是常量，里面的内容不能被修改
        //final int[] array = {1,2,3,4,5};
        //array = new int[]{4,5,6,7};//final修饰的array不能再指向另一个对象
    }
    public static void main9(String[] args) {
        String str1 = null;
        String str2 = "11";
        //使用equals方法时要防止空指针异常
        //System.out.println(str1.equals(str2));//Exception in thread "main" java.lang.NullPointerException
                                                //at com.yang.string.Test.main(Test.java:17)
        System.out.println(str2.equals(str1));//false
    }
    public static void main8(String[] args) {
        String str2 = new String("1")+new String("1");
        str2.intern();//手动入池==》 当字符串常量池 没有的时候，就会入池
        String str1 = "11";
        System.out.println(str1 == str2);//true

        System.out.println(str1.equals(str2));//比较内容

    }

    public static void main7(String[] args) {
        String str1 = "11";
        String str2 = new String("1")+new String("1");
        System.out.println(str1 == str2);//false
    }
    public static void main6(String[] args) {
        String str1 = "hello";
        String str2 = "he"+"llo";//此时 他两都是常量，编译的时候，就已经确定好了是"hello"
        String str3 = "he";
        String str4 = str3+"llo";//此时str3是一个变量-》编译的时候，不知道是啥
        System.out.println(str1 == str2);//true
        System.out.println(str3 == str4);//false
    }
    public static void main5(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1 == str2);//true
    }
    public static void main4(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);//比较的是里面存放的地址  false
    }

    public static void func(String s, char[] array){
        s = "gaobo";
        array[0] = 'p';
    }

    public static void main3(String[] args) {
        String str = "abcdef";
        char[] chars = {'b','i','t'};
        func(str,chars);
        System.out.println(str);
        System.out.println(Arrays.toString(chars));
    }

    public static void main2(String[] args) {
        String str = "abcdef";
        String str2 = str;
        System.out.println(str);
        System.out.println(str2);
        System.out.println("=============");
        str = "bit";
        System.out.println(str);
        System.out.println(str2);
    }
    public static void main1(String[] args) {
        //构造String的方式
        //方式一
        String str = "Hello";
        //方式二 调用构造方法进行构造对象
        String str1 = new String("Hello");

        //方式三 将字符数组转换成字符串
        char[] chars = {'a','b','c'};
        String str3 = new String(chars);
        System.out.println(str3);
    }


}

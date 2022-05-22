package com.yang.string;

/**
 * @program: JavaSE
 * @description: 字符串
 * @author: Mrs.Yang
 * @create: 2022-05-11 21:38
 **/
public class Test02 {

    public static void main(String[] args) {
        String str = "abcde";
        //会创建很多对象
        for (int i = 0; i < 10; i++){
            str += i;
        }
        System.out.println(str);
    }
    public static void main1(String[] args) {
        String str = "hello";
        str = str + "world";
        str += "!!!";
        System.out.println(str);
    }
}

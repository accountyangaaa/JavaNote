package com.yang.string;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rosy123
 * @Date: 2022/05/18/11:38
 * @Description: string方法使用
 */
public class Test03 {

    /**
     * 字符串查找
     * @param args
     */

    public static void main(String[] args) {
        System.out.println(fistUpper("yuisama"));
        System.out.println(fistUpper(""));
        System.out.println(fistUpper("a"));

    }

    private static String fistUpper(String str) {
        if ("".equals(str)||str==null){
            return str;
        }
        if (str.length()>1){
            return str.substring(0,1).toUpperCase()+str.substring(1);
        }
        return str.toUpperCase();
    }

    public static void main6(String[] args) {
        //String str = "helloworld";
        /*System.out.println(str.substring(5));
        System.out.println(str.substring(0,5));*/

        /*String str = "   hello  world  ";
        System.out.println("["+str+"]");
        System.out.println("["+str.trim()+"]");*/

        String str = "  hello%$$%@%world 哈哈哈  ";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        System.out.println("hello".isEmpty());//false
        System.out.println("".isEmpty());//true
        System.out.println(new String().isEmpty());//true

    }
    public static void main5(String[] args) {
        String str = "helloworld";
        System.out.println(str.contains("world"));//true


        System.out.println(str.indexOf("world"));//5
        System.out.println(str.indexOf("bit"));//-1
        if (str.indexOf("hello") != -1){
            System.out.println("可以查到指定字符串！");
        }

        //使用indexOf()的注意点
        String str2 = "helloworld";
        System.out.println(str2.indexOf("l"));//2
        System.out.println(str2.indexOf("l",5));//8
        System.out.println(str2.lastIndexOf("l"));//8

        //判断开头或结尾
        String str3 = "**@@helloworld!!";
        System.out.println(str3.startsWith("**"));//true
        System.out.println(str3.startsWith("@@",2));//true
        System.out.println(str3.endsWith("!!"));//true

        //字符串的替换处理
        String str4 = "helloworld";
        System.out.println(str4.replaceAll("l","_"));
        System.out.println(str4.replaceFirst("l", "_"));

        //实现字符串的拆分处理
        String str5 = "hello world hello bit";
        String[] result = str5.split(" ");//按空格拆分
        for (String s: result) {
            System.out.println(s);
        }

        //字符串的部分拆分
        String str6 = "hello world hello bit";
        String[] result1 = str6.split(" ",2);//按空格拆分
        for (String s: result1) {
            System.out.println(s);
        }

        //拆分IP地址
        String str7 = "192.168.1.1";
        String[] result2 = str7.split("\\.");
        for (String s:result2) {
            System.out.println(s);
        }

        //多次拆分
        String str8 = "name=zhangsan&age=18";
        String[] result3 = str8.split("&");
        for (int i = 0; i < result3.length; i++) {
            String[] temp = result3[i].split("=");
            System.out.println(temp[0]+" ="+temp[1]);
        }
    }
    public static void main4(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        //区分大小写比较
        System.out.println(str1.equals(str2));//false
        //不区分大小写比较
        System.out.println(str1.equalsIgnoreCase(str2));//true

        //比较两个字符串大小关系
        System.out.println("A".compareTo("a"));//-32
        System.out.println("a".compareTo("A"));//32
        System.out.println("A".compareTo("A"));//0
        System.out.println("AB".compareTo("AC"));//-1
        System.out.println("刘".compareTo("杨"));//-5456
    }
    public static void main3(String[] args) {
        String str = "helloworld";
        //String 转 byte[]
        byte[] data = str.getBytes();
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]+" ");
        }

        //byte[] 转 String
        System.out.println(new String(data));
    }
    public static void main2(String[] args) {
        String str = "1a23456";
        System.out.println(isNumber(str)? "字符串由数字所组成！":"字符串中有非数字成员！");
    }

    private static boolean isNumber(String str) {
        char[] data = str.toCharArray();
        for (int i = 0; i < data.length; i++) {
            if (data[i] < '0' || data[i] > '9'){
                return false;
            }
        }
        return true;
    }

    public static void main1(String[] args) {

        //获取指定位置的字符
        String str = "hello";
        System.out.println(str.charAt(0));//h
        //System.out.println(str.charAt(10));//StringIndexOutOfBoundsException异常

        //字符串与字符数组的转换
        String str1 = "helloworld";
        //将字符串变为字符数组
        char[] data = str.toCharArray();
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i]+" ");//h e l l o
        }

        //字符数组转为字符串
        System.out.println(new String(data));//hello
        System.out.println(new String(data,2,3));//llo
    }
}

package com.yang.string;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rosy123
 * @Date: 2022/05/18/19:44
 * @Description: StringBuffer类的使用
 */
public class Test04 {

    public static void main(String[] args) {
        //字符串反转
        StringBuffer sb = new StringBuffer("helloworld");
        //System.out.println(sb.reverse());
        //删除指定范围的数据
        //System.out.println(sb.delete(5,10));
        System.out.println(sb.delete(5,10).insert(0,"你好"));

    }
    public static void main1(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello").append("world");
        fun(sb);
        System.out.println(sb);
    }
    public static void fun(StringBuffer temp){
        temp.append("\n").append("www.bit.com.cn");
    }


}

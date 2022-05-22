package Homework;

/**
 * @program: JavaSE
 * @description:
 * @author: Mrs.Yang
 * @create: 2022-05-05 16:26
 **/
public class  A{
    static {
        System.out.println("A的静态代码块");
    }
    {
        System.out.println("A的实例代码块");
    }
    public A(){
        System.out.println("A的构造方法");
    }
}

class B extends A{
    static {
        System.out.println("B的静态代码块");
    }
    {
        System.out.println("B的实例代码块");
    }
    public B(){
        System.out.println("B的构造方法");
    }
}

class Test02{
    public static void main(String[] args) {
        B b = new B();
    }
}
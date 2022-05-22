package Homework;

/**
 * @program: JavaSE
 * @description: 类与对象的认识
 * @author: Mrs.Yang
 * @create: 2022-04-27 17:04
 **/


public class test01 {
    /*public static void hello() {
        System.out.println("hello");
    }

    public int aMethod(){
        static int i = 0;
        i++;
        return i;
    }*/
}
class MyApplication {
    static boolean Paddy;
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*test01 test=null;
        test.hello();*/

       /* String s;
        System.out.println("s="+s);*/

        /*test01 test = new test01();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);*/

        System.out.println(Paddy);

    }
}

class Person{

    private String name = "Person";

    int age=0;

}

/*
class Child extends Person{

    public String grade;

    public static void main(String[] args){

        Person p = new Child();

        System.out.println(p.name);

    }

}*/

class HasStatic {// 1
    private static int x = 100;// 2
    public static void main(String args[]) {// 3
        HasStatic hsl = new HasStatic();// 4
        hsl.x++;// 5
        HasStatic hs2 = new HasStatic();// 6
        hs2.x++;// 7
        hsl = new HasStatic();// 8
        hsl.x++;// 9
        HasStatic.x--;// 10
        System.out.println(" x=" + x);// 11
    }
}

class Test{

    private float f=1.0f;

    int m=12;

    static int n=1;

    public static void main(String args[]){

        Test t=new Test();
        t.f = 1.0f;

//        System.out.println(this.n);
//        System.out.println(Test.m);
        System.out.println(Test.n);
    }

}
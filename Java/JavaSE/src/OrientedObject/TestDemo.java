package OrientedObject;

public class TestDemo {
    public int a;
    public static int count;
    public static void change(){
        count = 100;
        //a = 10; error 不可以访问非静态数据成员
    }
}

class Main1{
    public static void main(String[] args) {
        {
            //直接使用{}定义，普通代码块
            int x = 10;
            System.out.println("x1 = "+x);
        }
        int x = 100;
        System.out.println("x2 = " +x);
    }
}

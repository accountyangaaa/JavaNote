package LinkedList;

import java.util.ArrayList;

/**
 * @program: JavaSE
 * @description: 顺序表测试类
 * @author: Mrs.Yang
 * @create: 2022-04-23 10:34
 **/
public class Test {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.display();
//        myArrayList.remove(5);
        System.out.println("==========");
        myArrayList.clear();
        myArrayList.display();

//        System.out.println(myArrayList.contains(3));
//        System.out.println(myArrayList.getPos(5));

    }
}

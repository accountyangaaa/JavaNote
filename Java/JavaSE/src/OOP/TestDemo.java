package OOP;
//import java.util.Date;
import java.util.*;
import java.sql.*;

import static java.lang.System.*;//自动导入
import static java.lang.Math.*;


/**
 * @program: JavaSE
 * @description: 面向对象编程
 * @author: Mrs.Yang
 * @create: 2022-04-28 11:48
 **/

public class TestDemo {
    public static void main1(String[] args) {
        out.println("hello");
    }
    public static void main(String[] args) {
        double x = 30;
        double y = 40;
        //double result = Math.sqrt(pow(x,2)+pow(y,2));
        //静态导入的方式写起来更方便一些
        double result = sqrt(pow(x,2)+pow(y,2));
        System.out.println(result);
    }
}

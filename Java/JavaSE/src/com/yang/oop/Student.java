package com.yang.oop;

/**
 * @program: JavaSE
 * @description: 组合
 * @author: Mrs.Yang
 * @create: 2022-05-03 12:58
 **/
public class Student implements Comparable{
    private String name;
    private int score;

    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "[" + this.name +":" + this.score + "]";
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        if (this.score > s.score){
            return -1;
        }else if (this.score < s.score){
            return 1;
        }else {
            return 0;
        }
    }
}


package LinkedList;

import java.util.Arrays;

/**
 * @program: JavaSE
 * @description: 顺序表
 * @author: Mrs.Yang
 * @create: 2022-04-23 10:32
 **/
public class MyArrayList {
    public int[] elem;    //定义一个数组
    public int usedSize; //存储大小

    public MyArrayList(){
        this.elem = new int[10]; //初始化数组
    }

    // 打印顺序表
    public void display() {
        for(int i = 0; i<this.usedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    // 获取顺序表的有效数据长度
    public int size() {
        return this.usedSize;
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        //1. pos位置不合法
        if(pos < 0 || pos > usedSize){
            System.out.println("pos位置不合法！");
            return;
        }
        //2. 是否放满used==len；==》扩容Arrays.copyOf()
        if (isFull()){
            this.elem = Arrays.copyOf(elem,2*this.elem.length); //扩容
        }
        //3. 从最后一个元素开始后移一个位置
        for (int i = usedSize-1;i>=pos;i-- ){
            this.elem[i+1] = this.elem[i];
        }
        //4. 在pos位置放数据
        this.elem[pos] = data;
        //5. 长度+1
        this.usedSize++;
    }
    //满不满？
    public boolean isFull(){
        return this.usedSize == this.elem.length;
    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (elem[i] == toFind){
                return true;
            }
        }
        return false;
    }
    //查找某个元素对应的位置,找不到返回-1
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (elem[i] == toFind){
                return i;
            }
        }
        return -1;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if (pos < 0 || pos >= this.usedSize){
            System.out.println("pos位置不合法！");
            return -1;
        }
        if (isEmpty()){
            System.out.println("顺序表为空！");
            return -1;
        }
        return elem[pos];
    }

    private boolean isEmpty() {
        return this.usedSize==0;
    }

    // 给 pos 位置的元素设为/更新 value
    public void setPos(int pos, int value) {
        if (pos < 0 || pos >= this.usedSize){
            System.out.println("pos位置不合法！");
            return;
        }
        if (isEmpty()){
            System.out.println("顺序表为空！");
            return;
        }
        this.elem[pos] = value;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        if (isEmpty()){
            System.out.println("顺序表为空！");
        }
        //查找要删的数字toRemove
        int index = search(toRemove);
        if (index == -1){
            System.out.println("没找到要删的数字！");
        }
        //删除数字，后一个元素赋值给前一个元素
        for (int i = index; i < usedSize-1; i++) {
            elem[i] = elem[i+1];
        }
        this.usedSize--;

        //this.elem[usedSize] = null; //如果数组当中是引用数据类型，则要释放引用为空

    }

    // 清空顺序表
    public void clear() {
        this.usedSize = 0;
        /*如果数组当中是引用数据类型，则要释放引用为空
        for (int i = 0; i < usedSize; i++) {
            this.elem[i] = null;
        }
        this.usedSize = 0;*/
    }
}

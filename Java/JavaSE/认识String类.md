字符串：在C语言里面是没有字符串这种数据类型的！String

什么是字符串？使用双引号，“abcdsa“  ”a“

什么是字符？只能放一个 ‘a’    ‘高’   ‘bca’错误的

注意问题：在Java中，没有所谓的，字符串以\0结尾！！！

看源码：

<img src="C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220507163524732.png" alt="image-20220507163524732" style="zoom: 67%;" />

![image-20220507164116605](C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220507164116605.png)



构造String的方式：

```java
public static void main1(String[] args) {
    //构造String的方式
    //方式一
    String str = "Hello";
    //方式二 调用构造方法进行构造对象
    String str1 = new String("Hello");

    //方式三 将字符数组转换成字符串
    char[] chars = {'a','b','c'};
    String str3 = new String(chars);
    System.out.println(str3);
}
```



```java
public static void main(String[] args) {
        String str = "abcdef";
        String str2 = str;
        System.out.println(str);
        System.out.println(str2);
        System.out.println("=============");
        str = "bit";
        System.out.println(str);
        System.out.println(str2);
    }

//运行结果
abcdef
abcdef
=============
bit
abcdef

```

既然str1和str2 都指向“abcdef”，是否可以通过str1修改“abcdef”-》“gbcdef”？

做不到，“abcdef”是字面值常量，是不可修改的

```java
public static void func(String s, char[] array){
    s = "gaobo";//修改了引用的指向
    array[0] = 'p';
}

public static void main(String[] args) {
    String str = "abcdef";
    char[] chars = {'b','i','t'};
    func(str,chars);
    System.out.println(str);
    System.out.println(Arrays.toString(chars));
}

//结果
abcdef
[p, i, t]
```

![image-20220507171514072](C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220507171514072.png)

不是说传引用就能改变实参的值，要看到底这个应用干啥了



概念：

Class文件常量池：int a = 10；磁盘上的

运行时常量池：当程序把编译好的字节码文件，加载到JVM当中后，会生成一个运行时常量池【方法区】、实际上是Class文件常量池

字符串常量池：主要存放字符串常量--》字符串常量池，本质上是一个**哈希表**。StringTable  双引号引起来的字符串常量。JDK1.8 开始，放在了堆里面

什么是池：1.数据库连接池，2.线程池 ...... 用的时候从池里拿  

意义：提高效率的

什么是哈希表：一种数据结构 --》描述和组织数据的一种方式

12，45， 2，7，15，92

问题：如何去查找到一个关键字

1.顺序查找

2.排序+二分查找

3.哈希查找，

**哈希表**存储数据的时候，会根据一个映射关系进行存储，如何映射，需要设计一个函数（哈希函数） key % len （len取10）

<img src="C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220507174217460.png" alt="image-20220507174217460" style="zoom:50%;" />



```java
public static void main(String[] args) {
    String str1 = "hello";
    String str2 = new String("hello");
    System.out.println(str1 == str2);//比较的是里面存放的地址  false
}
```

![image-20220507214156327](C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220507214156327.png)



```java
public static void main(String[] args) {
    String str1 = "hello";
    String str2 = "hello";
    System.out.println(str1 == str2);//true
}
```

![image-20220507215057614](C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220507215057614.png)



```java
public static void main(String[] args) {
    String str1 = "hello";
    String str2 = "he"+"llo";//此时 他两都是常量，编译的时候，就已经确定好了是"hello"
    System.out.println(str1 == str2);//true
}
```

验证：

<img src="C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220507215339213.png" alt="image-20220507215339213" style="zoom: 67%;" />

![image-20220507215553188](C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220507215553188.png)

shift+鼠标右键打开powershell窗口

先编译build project

![image-20220507215827933](C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220507215827933.png)

编译的时候已经将"he"+"llo"编译成hello

![image-20220507220042481](C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220507220042481.png)



```java
public static void main(String[] args) {
    String str1 = "hello";
    String str2 = "he"+"llo";//此时 他两都是常量，编译的时候，就已经确定好了是"hello"
    String str3 = "he";
    String str4 = str3+"llo";//此时str3是一个变量-》编译的时候，不知道是啥
    System.out.println(str1 == str2);//true
    System.out.println(str3 == str4);//false
}
```

![image-20220511161218938](C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220511161218938.png)



```java
public static void main(String[] args) {
    String str1 = "11";
    String str2 = new String("1")+new String("1");
    System.out.println(str1 == str2);//false
}
```

![image-20220511193624669](C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220511193624669.png)



![image-20220511193703702](C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220511193703702.png)



```java
public static void main(String[] args) {
    String str2 = new String("1")+new String("1");
    str2.intern();//手动入池==》 当字符串常量池 没有的时候，就会入池
    String str1 = "11";
    System.out.println(str1 == str2);//true

    System.out.println(str1.equals(str2));//比较内容

}
```

equals（）源码

```java
public boolean equals(Object anObject) {
    if (this == anObject) {
        return true;
    }
    if (anObject instanceof String) {
        String anotherString = (String)anObject;
        int n = value.length;
        if (n == anotherString.value.length) {
            char v1[] = value;
            char v2[] = anotherString.value;
            int i = 0;
            while (n-- != 0) {
                if (v1[i] != v2[i])
                    return false;
                i++;
            }
            return true;
        }
    }
    return false;
}
```

使用equals方法时要防止空指针异常

```java
public static void main(String[] args) {
    String str1 = null;
    String str2 = "11";
    //使用equals方法时要防止空指针异常
    //System.out.println(str1.equals(str2)); //str空指针，Exception in thread "main" java.lang.NullPointerException
                                            //at com.yang.string.Test.main(Test.java:17)
    System.out.println(str2.equals(str1));//false
}
```

数组的整体赋值  只有一次机会 就是在定义的时候

<img src="C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220511211031895.png" alt="image-20220511211031895" style="zoom:50%;" />

final修饰的是常量，里面的内容不能被修改

<img src="C:\Users\19713\AppData\Roaming\Typora\typora-user-images\image-20220511211249068.png" alt="image-20220511211249068" style="zoom:50%;" />



```java
public static void main(String[] args) {
    
    String str1 = null;//str1这个引用 不指向任何对象
    String str2 = "";//str2这个引用 指向的字符串是空的
    
}
```

字符串传参的时候要注意

```java
public static void func2(String s){
    //字符串传参的时候要注意
    if (s == null || s.length() == 0){

    }

    /**下面的会引发空指针异常
     * Exception in thread "main" java.lang.NullPointerException
     *     at com.yang.string.Test.func2(Test.java:19)
     *     at com.yang.string.Test.main(Test.java:29)
     */
    if (s.length() == 0 || s == null){ 

    }

}
```



# [Idea中开启assert断言 ](https://www.cnblogs.com/noKing/p/7978092.html)



字符串不可变

```java
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
```

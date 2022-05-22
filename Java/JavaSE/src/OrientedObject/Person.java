package OrientedObject;

public class Person {
    private int age;// 实例变量 存放在对象内
    private String name;//实例变量

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }
    public void show(){
        System.out.println("name：" + name + " age：" + age);
    }


}

class Main{
    public static void main(String[] args) {
        new Person("caocao", 19).show();//通过匿名对象调用方法
    }
}



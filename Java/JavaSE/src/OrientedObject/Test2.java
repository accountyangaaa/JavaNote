package OrientedObject;

public class Test2 {
    private int age;
    private String name;
    private String sex;


    public Test2(){
        System.out.println("无参构造方法");
    }

    public Test2(int age,String name){
        this.age = age;
        this.name = name;
    }

    public Test2(int age,String name,String sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Test2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }


}

class Main0{



    public static void main(String[] args) {
        Test2 test1 = new Test2();
        Test2 test2 = new Test2(1,"zhangsan");
        Test2 test3 = new Test2(2,"zhangsan","man");

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
    }
}

package OrientedObject;

public class MyValue {
    public int val;
}

class Test{
    public static void swap(MyValue val1,MyValue val2){
        int temp = val1.val;
        val1.val = val2.val;
        val2.val = temp;
    }

    public static void main(String[] args) {
        MyValue value1 = new MyValue();
        MyValue value2 = new MyValue();
        value1.val = 23;
        value2.val = 34;
        System.out.println("交换前 value1: "+value1.val+" value2: "+value2.val);
        swap(value1,value2);
        System.out.println("交换后 value1: "+value1.val+" value2: "+value2.val);
    }
}
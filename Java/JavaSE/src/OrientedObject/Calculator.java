package OrientedObject;

public class Calculator {
    private double num1;
    private double num2;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double add(double num1, double num2){
        return num1+num2;
    }

    public double subtract(double num1,double num2){
        return num1-num2;
    }

    public double multily(double num1,double num2){
        return num1*num2;
    }

    public double divide(double num1,double num2){
        return num1/num2;
    }

}

class Test1{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setNum1(5);
        double num1 = calculator.getNum1();
        calculator.setNum2(23);
        double num2 = calculator.getNum2();
        double add = calculator.add(num1,num2);
        System.out.println(num1+ "+" + num2 + "=" + add);
        System.out.println(num1+ "-" + num2 + "=" + calculator.subtract(num1,num2));
        System.out.println(num1+ "*" + num2 + "=" + calculator.multily(num1,num2));
        System.out.println(num1+ "/" + num2 + "=" + calculator.divide(num1,num2));

    }
}

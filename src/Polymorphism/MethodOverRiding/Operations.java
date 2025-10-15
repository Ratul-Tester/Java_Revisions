package Polymorphism.MethodOverRiding;

public class Operations {
    public static void main(String[] args) {
        num n = new num();
        n.add(); // Addition
        System.out.println("*************");
        num n1 = new num1();
        n1.add(); // Addition Extends
        System.out.println("*************");
        num n2 = new num2();
        n2.add(); // Last Child
        System.out.println("++++++++++++++++++++++++");
        num1 n0 = new num2();
        n0.add(); // Last Child
    }
}
class num{
    void add(){
        System.out.println("Addition");
    }
}
class num1 extends num{
    void add(){
        System.out.println("Addition Extends");
    }
}
class num2 extends num1{
    void add(){
        System.out.println("Last child");
    }
}

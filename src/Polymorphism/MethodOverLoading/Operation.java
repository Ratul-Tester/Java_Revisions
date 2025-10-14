package Polymorphism.MethodOverLoading;

class MathOperation {
    int add (int a, int b){
        return a+b;
    }
    double add (double a, double b){
        return a+b;
    }
}
public class Operation{
    public static void main(String[] args) {
        MathOperation m = new MathOperation();
        System.out.println(m.add(2,3));
        System.out.println(m.add(2.5,3.3));
    }
}


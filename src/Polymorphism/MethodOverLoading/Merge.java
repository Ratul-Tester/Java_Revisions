package Polymorphism.MethodOverLoading;

class Mathss {
    String name (String a, String b){
        return a+b;
    }
    String name (String a, int b){
        return a+b;
    }
}
public class Merge{
    public static void main(String[] args) {
        Mathss m = new Mathss();
        System.out.println(m.name("Raty",10));
        System.out.println(m.name("raty", "saty"));
    }
}
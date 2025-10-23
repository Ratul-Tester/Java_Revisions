package Polymorphism.MethodOverLoading;

public class MO_Loading {
    public static void main(String[] args) {
        subject s = new subject();
        s.add(10);
        s.add("Raty",20);
        s.add(10,"Raty",13.14f);
    }
}
class subject{
    void add(int a){
        a++;
        System.out.println("int a = "+a);
    }
    void add(String s, int b){
        System.out.println("int a + int b = "+(s+b));
    }
    void add(int a, String sb, float c){
        System.out.println("int a + double b + float c= "+(a+sb+c));
    }
}

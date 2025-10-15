package Polymorphism.MethodOverLoading;

public class God {
    public static void main(String[] args) {
     ultimate u = new ultimate();
        System.out.println(u.m1(10,"Raty"));
        System.out.println(u.m1("Raty",10));
        System.out.println(u.m1(10,20));
        System.out.println(u.m1(10.2,5));
    }
}
class ultimate{
    String m1(int a, String b){
        return a+b;
    }
    String m1(String a, int b){
        return a+b;
    }
    int m1(int c, int d){
        return c+d;
    }
    double m1(double a, int c){
        return a+c;
    }
}

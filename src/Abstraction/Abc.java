package Abstraction;

public class Abc {
    public static void main(String[] args) {
        cd c = new cd();
        c.m1();
        c.m2();
    }

}
abstract class Abcd{
    abstract void m1();
    abstract void m2();
}
abstract class bcd extends Abcd{
    @Override
    void m1() {
        System.out.println("M1 in bcd");
    }
}
class cd extends bcd{
    @Override
    void m2() {
        System.out.println("M2 in cd");
    }
}

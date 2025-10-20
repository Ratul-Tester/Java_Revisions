package Access_Modifiers;

public class Modifiers_Access {
    public static void main(String[] args) {
        Access acc = new Access();
        acc.print();
        System.out.println(acc.a);
        //System.out.println(acc.b); // b has private access in Access_Modifiers.Access
        System.out.println(acc.c);
        System.out.println(acc.d);
    }
}
class Access{
    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;
    void print(){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
    }
}

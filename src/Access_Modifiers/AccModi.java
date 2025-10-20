package Access_Modifiers;

public class AccModi {
    public static void main(String[] args) {
        Acc acc = new Acc();
        acc.Modi();
        System.out.println(acc.a);
        //System.out.println(acc.b); as b has private access in Access_Modifiers.Acc for this error result.
        System.out.println(acc.c);
        System.out.println(acc.d);
    }
}
class Acc {
    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;

    public void Modi(){
        System.out.println("int a = "+a);
        System.out.println("int b = "+b);
        System.out.println("int c = "+c);
        System.out.println("int d = "+d);
    }
}

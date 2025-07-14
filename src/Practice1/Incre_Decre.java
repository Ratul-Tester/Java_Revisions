package Practice1;

public class Incre_Decre {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println(a++ + ++a + a++); // 10+12+12=34
        System.out.println(b-- + --b + b--); // 20+18+18=56
    }
}

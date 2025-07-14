package Practice1;

public class Widening {
    public static void main(String[] args) {
        Byte b = 10;
        int a = b;
        int a1 = (int) b;
        System.out.println(a);
        System.out.println(a1);
        int a2 = 300;
        /*byte b1 = a2; //incompatible types: possible lossy conversion from int to byte*/
        byte b2 = (byte) a2;
        /*System.out.println(b1); //incompatible types: possible lossy conversion from int to byte*/
        System.out.println(b2);
    }
}

package Practice10;

public class Lab158 {
    public static void main(String[] args) {
        double d = returnPie();
        System.out.println(d);
        String c = returnString();
        System.out.println(c);
        int a = intf();
        System.out.println(a);
        byte b = bytef();
        System.out.println(b);
    }

    static byte bytef() {
        return 127;
    }

    static int intf() {
        return 0;
    }

    static String returnString() {
        return "Narmata";
    }

    static double returnPie() {
        return 3.14;
    }
}

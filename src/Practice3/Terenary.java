package Practice3;

public class Terenary {
    public static void main(String[] args) {
        int a = true ? 10 : 20;
        int a1 = (30>40) ? 30 : 40;
        System.out.println(a); // 10
        System.out.println(a1); // 40

        String str= 10 > 20 ? "10" : "TWENTY"; // TWENTY
        System.out.println(str);
    }
}

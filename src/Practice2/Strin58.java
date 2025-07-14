package Practice2;

public class Strin58 {
    public static void main(String[] args) {
        String s1 = "Raty";
        String s2 = new String(s1);
        String s3 = new String("Raty");
        System.out.println(s1==s2); //false
        System.out.println(s1==s3); //false
        System.out.println(s2==s3); //false
        System.out.println(s2.equals(s1)); //true
        System.out.println(s3.equals(s1)); //true
        System.out.println(s3.equals(s2)); //true

    }
}

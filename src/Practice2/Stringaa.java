package Practice2;

public class Stringaa {
    public static void main(String[] args) {
        String s1 = "Rama";
        String s2 = s1;
        System.out.println(s2);
        s2 = s2.toLowerCase();
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}

package Practice2;

public class String55 {
    public static void main(String[] args) {
        String s1 = "Ratul";
        String s2 = s1;
        System.out.println(s2);
        System.out.println("Is s1 = s2 :"+s1==s2);
        System.out.println("Is s2 contains the same value as s1: "+s1.equals(s2));
        String s3 = " Nandy";
        s3.toLowerCase();
        System.out.println(s3);
        String s4 = s1.concat(s3);
        System.out.println(s4);
        String s5 = s4.toLowerCase();
        System.out.println(s1.concat(s3));
        System.out.println(s5);
        System.out.println(s4.equalsIgnoreCase(s5));

    }
}

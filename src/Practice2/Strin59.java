package Practice2;

public class Strin59 {
    public static void main(String[] args) {
        String s1 = "Ratul Kumar";
        s1.concat(" Nandy");
        System.out.println(s1); //Ratul Kumar Nandy
        char c1 = s1.charAt(4);
        char c2 = s1.charAt(5);
        //char c3 = s1.charAt(11);
        System.out.println(c1); // l
        System.out.println(c2); //
        //System.out.println(c3); //
        Boolean result = s1.contains("a");
        Boolean space = s1.contains(" ");
        System.out.println(result); //true
        System.out.println(space); //true
    }
}

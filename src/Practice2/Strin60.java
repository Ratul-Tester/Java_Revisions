package Practice2;

public class Strin60 {
    public static void main(String[] args) {
        String pass = "Sambhu@143";
        String password = pass.toLowerCase();
        System.out.println(pass==password); //false
        System.out.println(pass.equals(password)); //false
        System.out.println(pass.equalsIgnoreCase(password)); //true
        System.out.println(pass.substring(0,9)); // Sambhu@14
        System.out.println(pass.substring(0,10)); // Sambhu@143
        System.out.println(pass.subSequence(0,9)); // Sambhu@14
        System.out.println(pass.subSequence(0,10)); // Sambhu@143
        System.out.println(pass.indexOf("S")); // 0
        System.out.println(pass.indexOf("3")); // 9
        System.out.println(pass.indexOf("@")); // 6
    }
}

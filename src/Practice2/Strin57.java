package Practice2;

public class Strin57 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " Guys";
        String str3 = "Hello Guys";
        String str4 = str1.concat(str2);
        System.out.println(str3); //Hello Guys
        System.out.println(str4); //Hello Guys
        System.out.println(str3==str4); //False
        System.out.println(str3.equals(str4)); //True


    }
}

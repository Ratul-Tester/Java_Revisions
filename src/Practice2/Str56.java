package Practice2;

public class Str56 {
    public static void main(String[] args) {
        String name = "Main";
        String name1 = "Main";
        String name2 = new String("Main");
        String name3 = new String(name2);
        System.out.println(name==name1); //true
        System.out.println(name1==name2); //false
        System.out.println(name1.equalsIgnoreCase(name2)); //true
        System.out.println(name2==name3); //false
    }
}

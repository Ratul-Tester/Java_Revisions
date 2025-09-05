package Practice10;

public class Lab155a {
    public static void main(String[] args) {
        System.out.println("Starting of the program");
        main("Ratul");
        main(38);
        System.out.println("End of the program");
        String r = main("Ram","Das");
        System.out.println(r);
    }

    static void main(String name) {
        System.out.println(name);
    }
    static void main(int age) {
        System.out.println(age);
    }
    static String main(String name, String title){
        System.out.println(name+" "+title);
        return "Hello";
    }
}

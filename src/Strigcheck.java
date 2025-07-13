public class Strigcheck {
    public static void main(String[] args) {
        String name = "Ratul";
        String name2 = new String(name);
        String name3 = new String(name2);
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name==name2);
        System.out.println(name==name3);
        System.out.println(name2==name3);
        System.out.println(name.getBytes());
        System.out.println(name2.getBytes());
        System.out.println(name3.getBytes());
        System.out.println(name.toLowerCase());
        System.out.println(name.chars());
        System.out.println(name.length());
        System.out.println("End of Program");

    }
}

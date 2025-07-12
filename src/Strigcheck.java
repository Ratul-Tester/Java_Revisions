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

    }
}

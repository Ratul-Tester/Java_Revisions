package Practice2;

public class Strin {
    public static void main(String[] args) {
        String name = "Ratul Nandy";
        String name1 = new String("Ratul Nandy");
        System.out.println(name);
        System.out.println("My name is --> "+name);
        System.out.printf("My name is --> %s\n",name);
        System.out.println(name1);
        System.out.println("My name is --> "+name1);
        System.out.printf("My name is --> %s",name1);
        System.out.println(name==name1);
        System.out.println(name.equals(name1));
    }
}

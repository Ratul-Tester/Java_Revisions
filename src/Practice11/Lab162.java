package Practice11;


import java.util.Scanner;

public class Lab162 extends Human{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        identity();
        System.out.println("Enter two numbers to do sum:");
        add(sc.nextInt(),sc.nextInt());
        name("Ratul");
    }

}

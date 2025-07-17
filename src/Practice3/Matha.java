package Practice3;

import java.util.Scanner;

public class Matha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the Square Root & Cube Root of that :");
        int a = sc.nextInt();
        double sqrt = Math.sqrt(a);
        double cqrt = Math.cbrt(a);
        System.out.println("The Square Root of :" +a + "is :" +sqrt);
        System.out.println("The Cube Root of :" +a + "is :" +cqrt);
    }
}

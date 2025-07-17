package Practice3;

import java.util.Scanner;

public class Mathaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The a number to find out the square of that number:");
        int a = sc.nextInt();
        int sqr = a*a;
        System.out.println("The square of "+a+" is :"+sqr);
    }
}

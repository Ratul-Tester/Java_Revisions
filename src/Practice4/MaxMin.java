package Practice4;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number A:");
        int a = sc.nextInt();
        System.out.println("Enter the second number B:");
        int b = sc.nextInt();
        int max = a > b ? a : b;
        int min = a > b ? b : a;
        System.out.println("The Max no. is :"+max);
        System.out.println("The Min no. is :"+min);

    }
}

package Practice7;

import java.util.Scanner;

public class TimePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to which you want to display the primes:");
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nEnter a number to check it is prime or not:");
        int num1 = sc.nextInt();

        boolean isPrime1 = true;
        for (int j = 2; j < num1; j++) {
            if (num1%j==0) {
                isPrime1 = false;
                break;
            }
        }
        if (isPrime1) {
            System.out.print(num1 + " is Prime");
        }
        else {
            System.out.println(num1+ " is not Prime");
        }
    }
}


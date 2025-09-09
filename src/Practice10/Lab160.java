package Practice10;

import java.util.Scanner;

public class Lab160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to display all the Primes");
        int prime = printPrime(sc.nextInt());
        System.out.println("\nEnter the number for which you want to display the factorial");
        long fact = factorial(sc.nextFloat());
    }
    static long factorial(float f){
        long facto = 1;
        for (int i = 1; i <= f; i++) {
            facto = facto*i;
            System.out.print(facto+" ");
        }
        System.out.println("\nThe Factorial of the number "+f +" is "+facto);
        return 0;
    }

    static int printPrime(int limit){
        for (int i = 2; i <= limit; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        return 0;
    }
}

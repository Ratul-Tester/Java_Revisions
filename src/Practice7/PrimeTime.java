package Practice7;

import java.util.Scanner;

public class PrimeTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to which you want to display all the primes:");
        int num = sc.nextInt();
        for (int i = 2; i < num; i++) {
            boolean isPrime = true;
            for (int j = 2; j<i ; j++){
                if (i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i+" ");
            }
        }
    }
}

package Practice6;

import java.util.Scanner;

public class DoBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to which you want to display the Primes:");
        int num = sc.nextInt();
        int i;
        int j;


        do {
            for (i=2;i<=num;i++){
                boolean isPrime = true;
                for (j=2;j<i;j++){
                    if (i%j==0){
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime){
                    System.out.print(i+" ");
                }
            }
        }while (i==2);
    }
}

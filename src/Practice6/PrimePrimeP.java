package Practice6;

import java.util.Scanner;

public class PrimePrimeP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to which you want display all the Prime:");
        int num = sc.nextInt();

        for (int i = 2;i<=num;i++){
            boolean isPrime = true;
            for (int j=2;i>j;j++){
                if (i%j==0){
                    isPrime = false;
                    break;
                }
            }if (isPrime){
                System.out.print(i+" ");
            }
        }
    }
}

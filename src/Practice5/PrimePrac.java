package Practice5;

import java.util.Scanner;

public class PrimePrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to which you want to display the prime numbers:");
        int ln = sc.nextInt();

        int i,j;
        for (i=1;i<=ln;i++){
            boolean isPrime = true;

            for (j=2;j<i;j++){
                if (i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i+"/");
            }
        }
    }
}

package Practice5;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to which you want to display the Prime Numbers:");
        int num = sc.nextInt();
        int i,j;
        for (i=1;i<=num;i++){
            boolean isPrime = true;
            for (j=2;j<i;j++){
                if (i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i+"-");
            }
        }
    }
}

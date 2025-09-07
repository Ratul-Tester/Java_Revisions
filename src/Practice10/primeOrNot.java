package Practice10;

import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is Prime or not:");
        int num = check(sc.nextInt());

    }
    static int check(int num){
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(num+" is Prime");
        } else {
            System.out.println(num+" is not Prime");
        }
        return 0;
    }

}

package Practice4;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check odd or even :");
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println("The number you entered is :"+a+" and it is a EVEN Number");
        }
        else{
            System.out.println("The number you entered is :"+a+" and it is a ODD Number");
        }


        System.out.println("Enter the number to find Odd or Even");
        int b = sc.nextInt();
        int result = b%2;
        if (result == 0){
            System.out.println("The number you have enetered is :"+b+" and it is a Even Number");
        }else{
            System.out.println("The number you have enetered is :"+b+" and it is a Odd Number");
        }
        sc.close();

    }
}

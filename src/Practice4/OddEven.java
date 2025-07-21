package Practice4;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find Odd or Even");
        int a = sc.nextInt();
        int result = a%2;
        if (result == 0){
            System.out.println("The number you have enetered is :"+a+" and it is a Even Number");
        }else{
            System.out.println("The number you have enetered is :"+a+" and it is a Odd Number");
        }
    }
}

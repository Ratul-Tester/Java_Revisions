package Practice4;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find Even or Odd");
        int a = sc.nextInt();
        if (a%2 == 0){
            System.out.println("The number you have entered is :"+a+" and it is a Even number");
        }else{
            System.out.println("The number you have entered is :"+a+" and it is a Odd number");
        }
    }
}

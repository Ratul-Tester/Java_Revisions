package Practice4;

import java.util.Scanner;

public class IfElseMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find the Max and Min");
        int a = sc.nextInt(), b = sc.nextInt();
        if (a>b){
            System.out.println("The Max no. is :"+a);
        } else if (b>a) {
            System.out.println("The Max no. is :"+b);
        }
        else
        {
            System.out.println("Both the numbers are equal");
        }
        System.out.println("The Min no. is :"+ Math.min(a , b));
    }
}

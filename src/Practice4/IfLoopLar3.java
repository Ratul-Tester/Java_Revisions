package Practice4;

import java.util.Scanner;

public class IfLoopLar3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers to find the max number:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println(+num1 +" is greater");
        } else if (num2>num1 && num2>num3){
            System.out.println(+num2 +" is greater");
        } /*else if (num1) {

        }*/ else if (num1==num2 || num2==num3) {
            System.out.println("Duplicate numbers identified");
        } else{
            System.out.println(+num3 +" is greater");
        }
    }
}

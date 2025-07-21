package Practice4;

import java.util.Scanner;

public class MathMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find Max & Min");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a , b);
        int min = Math.min(a , b);
        System.out.println("The number you have entered are :" +a+" and "+b);
        System.out.println("The Max number is -->" +max);
        System.out.println("The Min number is -->" +min);
    }
}

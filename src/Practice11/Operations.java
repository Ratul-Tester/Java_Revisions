package Practice11;

import java.util.Scanner;

public class Operations extends Maths{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find out +,-,/,* of both the numbers");
        Maths math = new Maths();
        System.out.println("Enter num1:");
        math.num1 = sc.nextInt();
        System.out.println("Enter num2:");
        math.num2 = sc.nextInt();

        add(math.num1, math.num2);
        sub(math.num1, math.num2);
        div(math.num1, math.num2);
        mul(math.num1, math.num2);
    }
}

package Practice10;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers below");
        System.out.println("Enter the first number (Num1):");
        int Num1 = sc.nextInt();
        System.out.println("Enter the second number (Num2):");
        int Num2 = sc.nextInt();
        System.out.println("Enter Operation Name like add,sub,mul,div for processing...");
        String str = sc.next();

        switch (str){
            case "add": addition(Num1, Num2);
                System.out.println(Num1+Num2);
            break;
            case "sub": substraction(Num1, Num2);
                System.out.println(Num1-Num2);
            break;
            case "mul": multiplication(Num1, Num2);
                System.out.println(Num1*Num2);
            break;
            case "div": division(Num1, Num2);
                System.out.println(Num1/Num2);
            break;
        }


    }
    static int division(int Num1, int Num2) {
        return Num1/Num2;
    }
    static int multiplication(int Num1, int Num2) {
        return Num1*Num2;
    }
    static int substraction(int Num1, int Num2) {
        return Num1-Num2;
    }
    static int addition(int Num1, int Num2) {
        return Num1+Num2;
    }
}

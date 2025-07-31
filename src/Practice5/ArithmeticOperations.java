package Practice5;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter two numbers to perform some Arithmetic Operations:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Select a character to perform the operation: '+' '-' '/' '*' '%'");
        char ch = sc.next().charAt(0);
        switch (ch){
            case '+'-> System.out.println("As you have selected addition, the result is :" +(num1+num2));
            case '-'-> System.out.println("As you have selected substraction, the result is :" +(num1-num2));
            case '/'-> System.out.println("As you have selected division, the result is :" +(num1/num2));
            case '*'-> System.out.println("As you have selected multiplication, the result is :" +(num1*num2));
            case '%'-> System.out.println("As you have selected modulus, the result is :" +(num1%num2));
            default -> System.out.println("Something went wrong");
        }
    }
}

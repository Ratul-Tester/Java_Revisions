package Practice10;

import java.util.Scanner;

public class Lab154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for an Arithmetic Operation:");

        // Scanner input of two numbers
        System.out.println("Enter Num1:");
        int Num1 = sc.nextInt();
        System.out.println("Enter Num2:");
        int Num2 = sc.nextInt();

        //Choosing an Operation
        System.out.println("Enter any of these characters to perform:\n'+'\n'-'\n'x'\n'/'");
        char ch = sc.next().charAt(0);

        //Using switch case to call methods
        switch (ch){
            case '+':add(Num1, Num2); System.out.println("As you have selected addition, the result is: "+(Num1+Num2));break;
            case '-':sub(Num1, Num2); System.out.println("As you have selected subtraction, the result is: "+(Num1-Num2));break;
            case 'x':mul(Num1, Num2); System.out.println("As you have selected multiplication, the result is: "+(Num1*Num2));break;
            case '/':div(Num1, Num2); System.out.println("As you have selected division, the result is: "+(Num1/Num2));break;
        }


        // Method Calling
        int addition = add(Num1, Num2);
        System.out.println("Addition of the two numbers is : "+addition);
        int subtraction = sub(Num1, Num2);
        System.out.println("Subtraction of the two numbers is : "+subtraction);
        int multiplication = mul(Num1, Num2);
        System.out.println("Multiplication of the two numbers is : "+multiplication);
        int division = div(Num1, Num2);
        System.out.println("Division of the two numbers gives : "+division+" as Quotient");

    }
    static int add(int Num1, int Num2){
        return Num1+Num2;
    }
    static int sub(int Num1, int Num2){
        return Num1-Num2;
    }
    static int mul(int Num1, int Num2){
        return Num1*Num2;
    }
    static int div(int Num1, int Num2){
        return Num1/Num2;
    }
}

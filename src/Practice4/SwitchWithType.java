package Practice4;

import java.text.BreakIterator;
import java.util.Scanner;

public class SwitchWithType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any primitive data type");
        System.out.println("It may be 'byte' \t 'int' \t 'char' \t'float' \t'double' \t 'long'");
        byte BYTE = sc.nextByte();
        int INT = sc.nextInt();
        char CHAR = sc.next().charAt(0);
        float FLOAT = sc.nextFloat();
        double DOUBLE = sc.nextDouble();
        long LONG = sc.nextLong();
        System.out.println("Enter a number for Byte "+BYTE);
        System.out.println("Enter a number for Int "+INT);
        System.out.println("Enter a number for Char "+CHAR);
        System.out.println("Enter a number for Float "+FLOAT);
        System.out.println("Enter a number for Double "+DOUBLE);
        System.out.println("Enter a number for Long "+LONG);

        switch (BYTE){
            case -128:
                System.out.println("First Range of Byte");
                break;
            case  127:
                System.out.println("Last Range of Byte");
                break;
            default:
                System.out.println("Check Input");
        }

        switch (INT){
            case -128:
                System.out.println("A Range of Int");
                break;
            case  127:
                System.out.println("A Range of Int");
                break;
            default:
                System.out.println("Check Input");
        }

        switch (CHAR){
            case 'a':
                System.out.println("It is a character");
                break;
            case  'z':
                System.out.println("It is a character");
                break;
            default:
                System.out.println("Check Input");
        }



    }
}

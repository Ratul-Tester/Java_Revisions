package Practice4;

import java.util.Scanner;

public class SwitchYeild {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to continue");
        char code = sc.next().charAt(0);
        int value = switch (code){
            case 'a':
                yield 97;
            case 'A':
                yield 65;
            default: //System.out.println("None");
                throw  new IllegalStateException("Error");
        };*/
        char code = 'A';
        int val = switch (code){
            case 'A':
                yield 65;
            case 'B':
                yield 66;
            default:
                System.out.println("Not able to find");
                throw  new IllegalStateException("Error");
        };
    }
}

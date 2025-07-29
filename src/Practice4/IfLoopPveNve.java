package Practice4;

import java.util.Scanner;

public class IfLoopPveNve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check positive or negative :");
        int num = sc.nextInt();
        if (num>=0){
            System.out.println(+num +" is a positive number");
        }else {
            System.out.println(+num +" is a negative number");
        }
    }
}

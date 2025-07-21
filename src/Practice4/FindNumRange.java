package Practice4;

import java.util.Scanner;

public class FindNumRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Numbers:");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        // Finding the Max Number
        if (a>b && a>c){
            System.out.println("This is the max no."+a );
        } else if (b>a && b>c) {
            System.out.println("This is the max no."+b );
        } else if (c>a && c>b) {
            System.out.println("This is the max no."+c );
        } else if ( a == b && a == c) { // Finding the equality
            System.out.println("It seems like entered numbers are same and that is :"+a);
        }
        // Finding the Min Number
        if (a<b && a<c){
            System.out.println("This is the min no."+a );
        } else if (b<a && b<c) {
            System.out.println("This is the min no."+b );
        } else if (c<a && c<b) {
            System.out.println("This is the min no."+c);
        }

    }
}

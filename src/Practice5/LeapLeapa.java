package Practice5;

import java.util.Scanner;

public class LeapLeapa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to find Leap Year or not:");
        int year = sc.nextInt();
        if ((year%4 == 0 && year%100 != 0) || year%400 == 0){
            System.out.println(+year + " is a LEAP YEAR");
        } else {
            System.out.println(+year + " is not a LEAP YEAR");
        }
    }
}

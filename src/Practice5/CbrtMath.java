package Practice5;

import java.util.Scanner;

public class CbrtMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        double x = sc.nextDouble();
        System.out.println("Enter the value of y:");
        double y = sc.nextDouble();
        System.out.println("Enter the value of z:");
        double z = sc.nextDouble();
        double result;
        result = Math.cbrt(Math.sqrt(x)+Math.sqrt(y)-Math.abs(z));
        System.out.println(result);
    }
}

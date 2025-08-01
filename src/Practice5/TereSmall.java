package Practice5;

import java.util.Scanner;

public class TereSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to find out the smallest among them:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int smallest = a < b ? a : (b < c ? b : (c < a ? c : a));
        System.out.println(+smallest+" is the smallest among other two numbers");
    }
}

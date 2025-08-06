package Practice6;

import java.util.Scanner;

public class ThizzFizz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the multiplication number for which it will be display Thizz:");
        int Thizz = sc.nextInt();
        System.out.println("Input the multiplication number for which it will be display Fizz:");
        int Fizz = sc.nextInt();

        for (int i=0;i<=100;i++){
            if (i%Thizz==0 && i%Fizz==0 ){
                System.out.println("Practice6.ThizzFizz");
            } else if (i%Thizz == 0) {
                System.out.println("Thizz");
            } else if (i%Fizz == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}

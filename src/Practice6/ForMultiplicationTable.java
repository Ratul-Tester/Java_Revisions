package Practice6;

import java.util.Scanner;

public class ForMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sunoyoni Please Enter the number for which you want to display the multiplication table:");
        int num = sc.nextInt();

        for (int i=1;i<=10;i++){
            System.out.println(num+" X "+i +" = "+ (num*i));
        }
    }
}

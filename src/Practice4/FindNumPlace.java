package Practice4;

import java.util.Scanner;

public class FindNumPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers :");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a>=b && b>c){
            System.out.println(" A is greater "+a);
        } else if (a>=b && a==b || a>c) {
            System.out.println(" A and B both are same " +a + +b );
        }
        if (a<=b && b>c){
            System.out.println(" B is greater"+b);
        } else if (a<=c && c>b){
            System.out.println(" C is greater " +c );
        }
        if (a>b && b>c){
            System.out.println(" B is somewhere between A and C");
        }

    }
}

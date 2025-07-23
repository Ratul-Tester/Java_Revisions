package Practice4;

import java.util.Scanner;

public class TrianlgeBySir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1,side2,side3, I will tell about the triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        // = Assign the value
        // == compare the values



        if((side1 == side2) && (side1 == side3) && (side2 == side3)){
            System.out.println("EQ");
        }else if((side1 == side2) || (side1 == side3) || (side2 == side3)){
            System.out.println("ISO");
        }else{
            System.out.println("Scalene!");
        }
    }
}

package Practice4;

import java.util.Scanner;

public class TriangleFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the sides of a Triangle :");
        int SideA = sc.nextInt(), SideB = sc.nextInt(), SideC = sc.nextInt();
        if (SideA == SideB && SideA == SideC ){
            System.out.println("All Sides are Equal, hence it's a Equilateral Triangle");
        } else if ((SideA == SideB && SideB != SideC) || (SideA == SideC) || (SideB == SideC)) {
            System.out.println("Two Sides are Equal, hence it's a Isosceles Triangle");
        } else if (SideA != SideB && SideA != SideC) {
            System.out.println("No Sides are Equal, hence it's a Scalene Triangle");
        }
    }
}

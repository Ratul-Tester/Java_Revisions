package Practice5;

import java.util.Scanner;

public class GradeTech {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total marks obtained:");
        float omarks = sc.nextFloat();
        System.out.println("Enter the Full marks in Total:");
        float fmarks = sc.nextFloat();
        float result = omarks/fmarks*100;
        int percentage = (int)result/10;

        switch (percentage){
            case 9 -> System.out.println("As your percentage is :"+result+" Your Grade Score is A+");
            case 8 -> System.out.println("As your percentage is :"+result+" Your Grade Score is A");
            case 7 -> System.out.println("As your percentage is :"+result+" Your Grade Score is B+");
            case 6 -> System.out.println("As your percentage is :"+result+" Your Grade Score is B");
            case 5 -> System.out.println("As your percentage is :"+result+" Your Grade Score is C+");
            case 4 -> System.out.println("As your percentage is :"+result+" Your Grade Score is C");
            case 3,2,1 -> System.out.println("As your percentage is :"+result+" Your Grade Score is FAIL");

        }
    }
}

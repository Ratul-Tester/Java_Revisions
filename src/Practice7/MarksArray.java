package Practice7;

import java.util.Scanner;

public class MarksArray {
    public static void main(String[] args) {
        // Create an array which takes all the marks in array and print it
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter the Math Marks:");
        marks[0]=sc.nextFloat();
        float maths = marks[0];
        System.out.println("Enter the Science Marks:");
        marks[1]=sc.nextFloat();
        float science = marks[1];
        System.out.println("Enter the SocialStudies Marks:");
        marks[2]=sc.nextFloat();
        float socialStudies = marks[2];
        System.out.println("Enter the English Marks:");
        marks[3]=sc.nextFloat();
        float english = marks[3];
        System.out.println("Enter the Hindi Marks:");
        marks[4]=sc.nextFloat();
        float hindi = marks[4];
        System.out.println("The marks you got in maths is: "+maths+"\nThe marks you got in science is: "+science+"\nThe marks you got in socialStudies is: "+socialStudies+"\nThe marks you got in english is: "+english+"\nThe marks you got in hindi is: "+hindi);
        float total = maths+science+socialStudies+english+hindi;
        System.out.println("The total marks is : "+total+" out of 500");
        float percentage = total/500*100;
        System.out.println("And the percentage is : "+percentage+"%");
    }
}

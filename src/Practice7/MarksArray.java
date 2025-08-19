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
        for (int i = 0; i < marks.length; i++) {
            if (marks[i]<40) {
                System.out.println("You are failed in a Subject, as you scored: "+marks[i]);
            } else if (marks[i]>=85) {
                System.out.println("Congrats you are Awesome, as you scored: "+marks[i]+" in one of the subject");
            }
        }
        if (percentage<=100 && percentage>=90) {
            System.out.println("You are a Genius, as you have scored "+percentage+"%");
        } else if (percentage<90 && percentage>=80) {
            System.out.println("You are a Awesome, as you have scored "+percentage+"%");
        } else if (percentage<80 && percentage>=70) {
            System.out.println("You are a Great, as you have scored "+percentage+"%");
        } else if (percentage<70 && percentage>=60) {
            System.out.println("You are a Nice, as you have scored "+percentage+"%");
        } else if (percentage<60 && percentage>=50) {
            System.out.println("You are a Very Good, as you have scored "+percentage+"%");
        } else if (percentage<50 && percentage>=40) {
            System.out.println("You are a Good, Try to improve as you have scored "+percentage+"%");
        } else if (percentage<40 && percentage>=00) {
            System.out.println("Sorry you are a Failed, as you have scored "+percentage+"%"+" Please focus on studies and try to improve");
        } else {
            System.out.println("Error: Wrong input, please check");
        }
    }
}

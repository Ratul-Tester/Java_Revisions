package Practice4;

import java.util.Scanner;

public class GradeSheet {
    public static void main(String[] args) {
        // ✅ Grade Calculator
        // Write a program that calculates and displays the letter grade for a given
        // numerical score (e.g., A, B, C, D, or F) based on the following
        // grading scale:       // 1. Find the user Inputs                 //A: 90-100
        //                      // score - data type? - int                // B: 80-89
        //                      // return -> grade -> data type -> char    //C: 70-79
        //                      // Interviewer ->  int, char               //D: 60-69
        //                                                                 //F: 0-59
        // 2. Basic Logic
        // if ( score >= 90 && score <= 100 ) -> return or print grade - A
        // else if score <=89 && score >= 80 -> return or orint grade - B
        // else -> grade -> F
        // 3. Write the code

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = sc.next();
        Scanner sci = new Scanner(System.in);
        System.out.println("Hi "+name+"\n What is the percentage of Marks you gained ? \nPlease enter :");
        int Percentage = sci.nextInt();
        if (Percentage <= 100 && Percentage >=90){
            System.out.println("Awesome you are Brilliant and as your percentage is :"+Percentage+"%"+"\nYour Grade is O+ "+name);
        } else if (Percentage < 90 && Percentage >=80) {
            System.out.println("Awesome you are Superb and as your percentage is :"+Percentage+"%"+"\nYour Grade is O "+name);
        } else if (Percentage < 80 && Percentage >=70) {
            System.out.println("Awesome you are Nice and as your percentage is :"+Percentage+"%"+"\nYour Grade is A+ "+name);
        } else if (Percentage < 70 && Percentage >=60) {
            System.out.println("Awesome you are Good and as your percentage is :"+Percentage+"%"+"\nYour Grade is A "+name);
        } else if (Percentage < 60 && Percentage >=50) {
            System.out.println("Well done, try to IMPROVE and as your percentage is :"+Percentage+"%"+"\nYour Grade is B+ "+name);
        } else if (Percentage < 50 && Percentage >=40) {
            System.out.println("Okay, try to IMPROVE and as your percentage is :"+Percentage+"%"+"\nYour Grade is B "+name);
        } else if (Percentage < 40 && Percentage >=00) {
            System.out.println("Sorry, try HARD to IMPROVE yourself and as your percentage is :"+Percentage+"%"+"\nI am sorry to inform you that you are FAILED "+name);
        }
        sc.close();
        sci.close();
    }
}

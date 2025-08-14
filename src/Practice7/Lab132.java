package Practice7;

import java.util.Scanner;

public class Lab132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Please Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hi "+name+" Please fill the below statements for evaluation of your result:");
        System.out.println("Enter the marks obtained in Maths (Subject Code : O):");
        marks[0]=sc.nextFloat();
        System.out.println("Enter the marks obtained in Evs (Subject Code : 1):");
        marks[1]=sc.nextFloat();
        System.out.println("Enter the marks obtained in Science (Subject Code : 2):");
        marks[2]=sc.nextFloat();
        System.out.println("Enter the marks obtained in English (Subject Code : 3):");
        marks[3]=sc.nextFloat();
        System.out.println("Enter the marks obtained in Hindi (Subject Code : 4):");
        marks[4]=sc.nextFloat();
        float totalmarks = marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
        float percentage = totalmarks/500*100;
        System.out.println(name+" you have got "+totalmarks+" as total and you have secured "+percentage+"%");

        for (int i = 0; i < marks.length; i++){
            if (marks[i]<40){
                System.out.println(name+" you are failed in one subject as you have scored "+marks[i]+" marks in one of the subject");
            }
            if (marks[i]>=90){
                System.out.println("Hey Genius "+name+" you got stars in one of the Subject in which you have scored "+marks[i]);
            }
        }
        if (percentage<=100 || percentage>=90) {
            System.out.println("You are a Genius, as you have scored "+percentage+"%");
        } else if (percentage<90 || percentage>=80) {
            System.out.println("You are a Awesome, as you have scored "+percentage+"%");
        } else if (percentage<80 || percentage>=70) {
            System.out.println("You are a Great, as you have scored "+percentage+"%");
        } else if (percentage<70 || percentage>=60) {
            System.out.println("You are a Nice, as you have scored "+percentage+"%");
        } else if (percentage<60 || percentage>=50) {
            System.out.println("You are a Very Good, as you have scored "+percentage+"%");
        } else if (percentage<50 || percentage>=40) {
            System.out.println("You are a Good, Try to improve as you have scored "+percentage+"%");
        } else if (percentage<40 || percentage>=00) {
            System.out.println("Sorry you are a Failed, as you have scored "+percentage+"%"+" Please focus on studies and try to improve");
        } else {
            System.out.println("Error: Wrong input, please check");
        }

    }
}

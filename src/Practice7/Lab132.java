package Practice7;

import java.util.Scanner;

public class Lab132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter the marks obtained in Maths:");
        marks[0]=sc.nextFloat();
        System.out.println("Enter the marks obtained in Evs:");
        marks[1]=sc.nextFloat();
        System.out.println("Enter the marks obtained in Science:");
        marks[2]=sc.nextFloat();
        System.out.println("Enter the marks obtained in English:");
        marks[3]=sc.nextFloat();
        System.out.println("Enter the marks obtained in Hindi:");
        marks[4]=sc.nextFloat();
        float totalmarks = marks[0]+marks[1]+marks[2]+marks[3]+marks[4];

        for (int i = 0; i < marks.length; i++){
            System.out.println("The Marks you have entered is:"+marks[i]);

        }
        if (totalmarks<=100 || totalmarks>=90) {
            System.out.println("You are a Geniuos ");
        }

    }
}

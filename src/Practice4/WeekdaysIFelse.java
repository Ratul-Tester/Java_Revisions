package Practice4;

import java.util.Scanner;

public class WeekdaysIFelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number from 1 to 7 and I will display the day:");
        int day = sc.nextInt();
        if (day==1){
            System.out.println("As you have entered 1, that is starting day of a week 'MONDAY'");
        } else if (day==2) {
            System.out.println("As you have entered 2, the week day is 'TUESDAY'");
        } else if (day==3) {
            System.out.println("As you have entered 3, the week day is 'WEDNESSDAY'");
        } else if (day==4) {
            System.out.println("As you have entered 4, the week day is 'THURSDAY'");
        } else if (day==5) {
            System.out.println("As you have entered 5, the week day is 'FRIDAY'");
        } else if (day==6) {
            System.out.println("As you have entered 6, the week day is 'SATURDAY'");
        } else if (day==7) {
            System.out.println("As you have entered 7, the week day is 'SUBDAY'");
        } else {
            System.out.println("Out of Range, LOL may be you are from another Planet");
        }

    }
}

package Practice4;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number from 1 to 7 and I will display the day:");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("As you have entered 1, that is starting day of a week 'MONDAY'");
                break;
            case 2:
                System.out.println("As you have entered 2, the week day is 'TUESDAY'");
                break;
            case 3:
                System.out.println("As you have entered 3, the week day is 'WEDNESSDAY'");
                break;
            case 4:
                System.out.println("As you have entered 4, the week day is 'THURSDAY'");
                break;
            case 5:
                System.out.println("As you have entered 5, the week day is 'FRIDAY'");
                break;
            case 6:
                System.out.println("As you have entered 6, the week day is 'SATURDAY'");
                break;
            case 7:
                System.out.println("As you have entered 7, the week day is 'SUNDAY'");
                break;
            default:
                System.out.println("Out of Range, LOL may be you are from another Planet");
        }
        //if (day>=0 && day<7){
        //System.out.println("Out of Range, LOL may be you are from another Planet");}

    }
}

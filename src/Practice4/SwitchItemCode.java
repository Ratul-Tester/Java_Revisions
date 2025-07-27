package Practice4;

import java.util.Scanner;

public class SwitchItemCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Item code for description");
        int itemCode = sc.nextInt();
        System.out.println("Enter the character to identify vowel");
        char character = sc.next().charAt(0);

        switch (itemCode){
            case 1,2,3,4,5,6,7,8,9,10:
                System.out.println("All Laptops Models");
                break;
            case 11,12,13,14,15,16,17,18,19,20:
                System.out.println("All Desktop Models");
                break;
            case 101,102,103,104,105,106,107,108,109,110:
                System.out.println("All 5G Smart Phones Models");
                break;
        }

        switch (character){
            case 'a','e','i','o','u':
                System.out.println("It's a Vowel");
                break;
            default:
                System.out.println("It's a Consonant");
        }
    }
}

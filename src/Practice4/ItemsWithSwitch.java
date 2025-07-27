package Practice4;

import java.util.Scanner;

public class ItemsWithSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the item code for description:");
        int code = sc.nextInt();
        if (code<=0 || code!=0){
            switch (code){
                case 1,2,3,4,5,6,7,8,9,10:
                    System.out.println("The item is ELECTRONIC");
                    break;
                case 11,12,13,14,15,16,17,18,19,20:
                    System.out.println("The item is Home Decor");
                    break;
                case 21,22,23,24,25,26,27,28,29,30:
                    System.out.println("The item is GROCERY");
                    break;
                case 31,32,33,34,35,36,37,38,39,40:
                    System.out.println("The item is FURNITURE");
                    break;
                default:
                    System.out.println("Invalid Item");
            }
        }
    }
}

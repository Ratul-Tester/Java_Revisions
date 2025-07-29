package Practice4;

import java.util.Scanner;

public class SwitchOn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item code to check description");
        int code = sc.nextInt();
        switch (code){
            case 1,2,3,4,5 -> System.out.println("Item code "+code+" falls under electronic items");
            case 6,7,8,9,10 -> System.out.println("Item code "+code+" falls under Furniture items");
            default -> System.out.println("Unknown");
        }
        System.out.println("Enter a letter to identify Vowel or Consonant");
        char ch = sc.next().charAt(0);
        switch (ch){
            case 'a','e','i','o','u'-> System.out.println(+ch+" It's a Vowel");
            case 'A','E','I','O','U'-> System.out.println(+ch+" It's a Vowel");
            default -> System.out.println(+ch+" Seems like consonant");
        }
    }
}

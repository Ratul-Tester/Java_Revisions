package Practice4;

import java.util.Scanner;

public class VowelIdentify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a character to identify whether it belongs to VOWEL or not :");
        String Letter = String.valueOf(sc.next().charAt(0));
        Letter = Letter.toLowerCase();
        switch (Letter){
            case "a":
                System.out.println("The first character belongs to vowel group");
                break;
            case "e":
                System.out.println("The first character belongs to vowel group");
                break;
            case "i":
                System.out.println("The first character belongs to vowel group");
                break;
            case "o":
                System.out.println("The first character belongs to vowel group");
                break;
            case "u":
                System.out.println("The first character belongs to vowel group");
                break;
            default:
                System.out.println("The first character is not a Vowel");
        }
    }
}

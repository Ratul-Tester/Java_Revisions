package Practice4;


import java.util.Scanner;

public class FindingVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Try to enter a letter in LOWER CASE to identify Vowel");
        char letter = sc.next().charAt(0);

        switch (letter){
            case 'a' :
                System.out.println("'a' is in Vowel");
                break;
            case 'A' :
                System.out.println("'A' is in Vowel");
                break;
            case 'e':
                System.out.println("'e' is in Vowel");
                break;
            case 'E' :
                System.out.println("'E' is in Vowel");
                break;
            case 'i':
                System.out.println("'i' is in Vowel");
                break;
            case 'I' :
                System.out.println("'I' is in Vowel");
                break;
            case 'o':
                System.out.println("'o' is in Vowel");
                break;
            case 'O' :
                System.out.println("'O' is in Vowel");
                break;
            case 'u':
                System.out.println("'u' is in Vowel");
                break;
            case 'U' :
                System.out.println("'U' is in Vowel");
                break;
            default:
                System.out.println("I couldn't identify this in Vowel");
        }
    }
}

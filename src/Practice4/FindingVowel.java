package Practice4;


import java.util.Scanner;

public class FindingVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter in LOWER CASE to identify Vowel");
        char letter = sc.next().charAt(0);

        switch (letter){
            case 'a':
                System.out.println("'a' is in Vowel");
                break;
            case 'e':
                System.out.println("'e' is in Vowel");
                break;
            case 'i':
                System.out.println("'i' is in Vowel");
                break;
            case 'o':
                System.out.println("'o' is in Vowel");
                break;
            case 'u':
                System.out.println("'u' is in Vowel");
                break;
            default:
                System.out.println("I couldn't identify this in Vowel");
        }
    }
}

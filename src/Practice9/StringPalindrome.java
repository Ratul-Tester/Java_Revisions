package Practice9;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check whether it's Palindrome or not:");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();

        if (str.equalsIgnoreCase(reverse)){
            System.out.println(str+" is Palindrome");
        } else {
            System.out.println("As "+str+" doesn't match with "+reverse+" it is not a Palindrome");
        }
    }
}

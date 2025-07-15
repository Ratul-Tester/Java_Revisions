package Practice2;

import java.util.Scanner;

public class Scann {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your nick name:");
        String nick = sc.next();
        //System.out.println("Please input your nick name:");
        System.out.printf("Your nick name is: %s",nick);
    }
}

package Practice4;

import java.util.Scanner;

public class InBetweenFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 nos.");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if(a>b){
            System.out.println(+a+" > "+b);
        }else if(a>c){
            System.out.println(+a+" is between "+b+" and "+c);
        }else{
            System.out.println(+a+" is < "+b);
        }
    }
}

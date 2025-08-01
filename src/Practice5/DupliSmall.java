package Practice5;

import java.util.Scanner;

public class DupliSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 6 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        System.out.println("The numbers you have entered are :"+a+" "+b+" "+c+" "+d+" "+e+" "+f);

        int smallest = a < b ? a : (b < c ? b : (c < d ? c : (d < e ? d : (e < f ? e : f))));
        System.out.println("And "+smallest +" is the smallest among all");

        if (a==b || a==c || a==d || a==e || a==f){
            System.out.println(+a + " is the duplicate");
        } else if (b==c || b==d || b==e || b==f){
            System.out.println(+b + " is the duplicate");
        } else if (c==d || c==e || c==f){
            System.out.println(+c + " is the duplicate");
        } else if (d==e || d==f){
            System.out.println(+d + " is the duplicate");
        } else if (e==f){
            System.out.println(+e + " is the duplicate");
        } else {
            System.out.println("No Dupicates");
        }
    }
}

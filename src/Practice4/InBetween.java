package Practice4;

import java.util.Scanner;

public class InBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter 3 nos.");
        //int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int number = sc.nextInt();
        if(number > 20){    //if(a>b)
            System.out.println("num > 20"); // sout("a>b");
        }else if( number > 10){ //else if(a>c)
            System.out.println("num is between 10 and 20"); // sout("a is between b and c");
        }else{  //else
            System.out.println("Num is < 20");  // sout("a is <b");
        }
    }
}

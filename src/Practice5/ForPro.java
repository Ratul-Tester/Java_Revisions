package Practice5;

import java.util.Scanner;

public class ForPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to which you want to display the prime numbers:");
        int num = sc.nextInt();
        int i,j;

        for (i=2; i<=num; i++){     //2,3,4
            boolean isPrime = true; //true,true,true
            for (j=2; j<i; j++){    //false,true,true
                if (i%j == 0){       // ,3false,4true
                    isPrime=false;  //
                    break;
                }
            }
            if (isPrime){
                System.out.print(i+"/");    //2/3/
            }
        }
        }
    }


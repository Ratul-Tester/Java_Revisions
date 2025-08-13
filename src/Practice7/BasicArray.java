package Practice7;

import java.util.Arrays;

public class BasicArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(nums.length);
        System.out.print(nums[4]);
        System.out.print(" "+nums[3]);
        System.out.print(" "+nums[2]);
        System.out.print(" "+nums[1]);
        System.out.print(" "+nums[0]+"\n");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        String[] names = {"Isqu","Visk","Pyar","Vyar"};
        System.out.print(names[3]);
        System.out.print(" "+names[2]);
        System.out.print(" "+names[1]);
        System.out.print(" "+names[0]+"\n");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        int[] ages = new int[5];
        ages[0] = 1;
        ages[1] = 2;
        ages[2] = 3;
        ages[3] = 4;
        ages[4] = 5;
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i]+" ");
        }
        System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        String[] allNames = new String[4];
        allNames[0]="Hare";
        allNames[1]="Krishna";
        allNames[2]="Hare";
        allNames[3]="Ram";
        for (int i = 0; i < allNames.length; i++) {
            System.out.print(allNames[i]+" ");
        }
        System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        int[] hole1 = {1,2,3};
        int[] hole2 = {1,2,3};
        int[] hole3 = hole1;
        System.out.println(hole1);
        System.out.println(hole2);
        System.out.println(hole3);
        System.out.println(hole1==hole3);
        System.out.println(Arrays.equals(hole2, hole3)); //checks contains which is true
        System.out.println(hole1.equals(hole3)); //checks address which is true
        System.out.println(hole2.equals(hole3)); //checks address which is false
        System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        String k ="1";
        String j ="1";
        System.out.println(k.contentEquals(j));
        System.out.println(k.equals(j));
        System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        int[] lone = {1,2,4,16,25};
        System.out.println(lone.length); //length=5
        System.out.println(Arrays.stream(lone).max()); //max-25
        System.out.println(Arrays.stream(lone).min()); //min-1
        for (int i = 0; i < lone.length; i++) {
            System.out.println("The LONE numbers are: "+lone[i]);
        }
        System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        int[] multi = {2,3,4};
        for (int i = 0; i <= 10; i++) {
            System.out.println(multi[0]+"X"+i+"="+multi[0]*i+"\t"+multi[1]+"X"+i+"="+multi[1]*i+"\t"+multi[2]+"X"+i+"="+multi[2]*i);
        }
    }
}

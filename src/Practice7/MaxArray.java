package Practice7;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxArray {
    public static void main(String[] args) {
        // Find the max from the array list
        int[] nums = {2,6,9,8,7};
        OptionalInt mi = Arrays.stream(nums).min();
        System.out.println(mi+" is minimum");
        int min = mi.getAsInt();
        System.out.println(min+" is minimum");
        OptionalInt ma = Arrays.stream(nums).max();
        int max = ma.getAsInt();
        System.out.println(ma+" is maximum");
        System.out.println(max+" is maximum");

    }
}

package Practice8;

import java.util.Arrays;

public class StringElementFinder {
    public static void main(String[] args) {
        String[][] fruits = {
                {"apple","pineapple","orange","berry"},
                {"papaya","guava","grape","banana"}
        };

        String fruit1 = "apple";   // first element to search
        String fruit2 = "banana";  // second element to search

        boolean found1 = false, found2 = false;

        // loop through 2D array
        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < fruits[i].length; j++) {
                if (fruits[i][j].equalsIgnoreCase(fruit1)) {
                    found1 = true;
                }
                if (fruits[i][j].equalsIgnoreCase(fruit2)) {
                    found2 = true;
                }
            }
        }

        // final result
        if (found1 && found2) {
            System.out.println(fruit1 + " and " + fruit2 + " are present in the array.");
        } else if (found1) {
            System.out.println(fruit1 + " is present but " + fruit2 + " is NOT present.");
        } else if (found2) {
            System.out.println(fruit2 + " is present but " + fruit1 + " is NOT present.");
        } else {
            System.out.println("Neither " + fruit1 + " nor " + fruit2 + " is present.");
        }
    }
}

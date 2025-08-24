package Practice8;

import java.util.Arrays;

public class ElementsFinderInString {
    public static void main(String[] args) {
        String[][] fruits = {
                {"Banana","Apple","Grape","Dragon"}
               ,{"Tomato","Litchi","BlackBerry","PineApple"}
        };
        String fruit1 = "Apple"; String fruit2 = "Grape";
        boolean found1 = false; boolean found2 = false;
        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < fruits[i].length; j++) {
                if (fruits[i][j].contentEquals(fruit1)){
                    found1 = true;
                }
                if (fruits[i][j].contentEquals(fruit2)){
                    found2 = true;
                }
            }
        }
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

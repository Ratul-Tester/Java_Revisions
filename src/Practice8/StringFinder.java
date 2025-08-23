package Practice8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class StringFinder {
    public static void main(String[] args) {
        String[] names = {"apple","grape","pineapple","lemon"};
        String tar = "grape";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        if (Arrays.asList(names).contains(tar)){
            System.out.println("And "+tar+" found in the list");
        }else {
            System.out.println("And "+tar+" not found in the list");
        }
    }
}

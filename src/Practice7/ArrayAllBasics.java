package Practice7;

import java.util.Arrays;

public class ArrayAllBasics {
    public static void main(String[] args) {
        byte[] byteArray = {-127,0,127};
        int[] intArray = {123,246,143};
        long[] longArray = {123,246,143};
        float[] floatArray = {12.32f,32.12f,13.23f};
        double[] doubleArray = {12.32,32.12,13.23};
        char[] charArray = {'A','a','B'};
        String bal = charArray.toString();
        boolean[] booleanArray = {true,false,true};
        String[] stringArray = {"Jai","Shree","Krishna"};
        String str1= "Ramesh Rao";

        System.out.println(byteArray.length);
        System.out.println(intArray.equals(longArray));
        System.out.println(floatArray.equals(doubleArray));
        System.out.println(charArray.toString());
        System.out.println(bal);
        System.out.println(str1.length());
    }
}

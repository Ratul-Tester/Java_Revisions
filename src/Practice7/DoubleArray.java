package Practice7;

public class DoubleArray {
    public static void main(String[] args) {
        // Create an array to double all the inputs and store it into a new array
        int[] single = {2,3,4};
        int[] doubler = new int[4];

        for (int i = 0; i < single.length; i++) {
            doubler[i] = single[i]*2;
            System.out.println(doubler[i]);
        }
        System.out.print(doubler[0]);
        System.out.print(" "+doubler[1]);
        System.out.print(" "+doubler[2]);
        System.out.print(" "+doubler[3]);

    }
}

package Practice7;

public class ArrayMax {
    public static void main(String[] args) {
        int[] numbers = {12,51,26,23,14,28,85};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max = numbers[i];
            }
            if (numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("The Max integer is :"+max);
        System.out.println("The Min integer is :"+min);
    }
}

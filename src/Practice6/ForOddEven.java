package Practice6;

public class ForOddEven {
    public static void main(String[] args) {
        int countOdd = 0;
        int countEven = 0;
        for (int i = 1;i<=9;i++){
            if (i%2!=0){
                System.out.println(i+" is Odd");
                countOdd++;
            } else {
                System.out.println(i+" is Even");
                countEven++;
            }
        }
        System.out.println("The number of Odd numbers are:"+countOdd);
        System.out.println("The number of Even numbers are:"+countEven);
    }
}

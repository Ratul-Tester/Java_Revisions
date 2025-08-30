package Practice10;

public class Lab150 {
    public static void main(String[] args) {
       int result = sumOfNumbers();
        System.out.println("Sum of Numbers is: "+(result+5));

       int result1 = subOfNumbers();
        System.out.println("Sub of Numbers is: "+(result1+11));

        int result2 = mulOfNumbers();
        System.out.println("Multiplication of Numbers is: "+(result2+4));
    }

    static int mulOfNumbers() {
        return 2*3;
    }

    static int subOfNumbers() {
        return 2-3;
    }

    static int sumOfNumbers() {
        return 2+3;
    }
}

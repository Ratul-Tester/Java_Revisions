package Practice10;

public class Lab151 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int result = SumofTwoNumbers(2,3);
        System.out.println(result);

        int result1 = SubofTwoNumbers(2,3);
        System.out.println(result1);

        int result2 = MulofTwoNumbers(2,3);
        System.out.println(result2);
    }

    static int MulofTwoNumbers(int a, int b) {
        return a * b;
    }

    static int SubofTwoNumbers(int a, int b) {
        return a - b;
    }

    static int SumofTwoNumbers(int a, int b) {
        return a + b;
    }
}

package Practice5;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100 are:");

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            // Check if 'i' is divisible by any number from 2 to i-1
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // Not a prime number
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

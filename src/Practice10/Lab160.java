package Practice10;

public class Lab160 {
    public static void main(String[] args) {
        printPrimes(100);
    }
    static void printPrimes(int limit){
        boolean isPrime = true;
        for (int i = 2; i <= 100 ; i++) {
            for (int j = 2; j < i ; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i+" ");
            }
        }
    }
}

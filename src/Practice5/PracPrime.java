package Practice5;

public class PracPrime {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100:");
        int i,j;
        for (i = 1; i <= 100; i++){
            boolean isPrime = true;

            for (j=2; j<i; j++){
                if (i%j == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime){
                System.out.print(i+"/");
            }
        }
    }
}

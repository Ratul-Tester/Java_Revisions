package Practice6;

public class DoWhileEvenOdd {
    public static void main(String[] args) {
        int i;
        for (i=1;i<=10;i++) {

            do {
                                System.out.println(i + " Even");
                i++;
            } while (i % 2 == 0);
            if (i%2==1){
                System.out.println(i +" Odd");
            }
        }
    }
}

package Practice6;

public class WhileEvenOdd {
    public static void main(String[] args) {
        int i;
        for (i=1;i<=10;i++){
        while (i%2==1) {
            System.out.println(i + " Odd");
            i++;
        }
            if (i % 2 == 0) {
                System.out.println(i + " Even");
            }
        }

        }
    }


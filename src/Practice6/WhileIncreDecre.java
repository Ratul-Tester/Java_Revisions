package Practice6;

public class WhileIncreDecre {
    public static void main(String[] args) {
        int incre, decre;

        for (incre=1;incre<=10;){
            while (incre<=10){
                System.out.print(incre+" ");
                incre++;
            }
        }
        for (decre=10;decre>=1;){
            while (decre>=1){
                System.out.print(decre+" ");
                decre--;
            }
        }
    }
}

package Practice6;

public class Lab109 {
    public static void main(String[] args) {
        int count = 0;
        for (int i=1;i<=10;i++){
            if (i==5){
                break;
            }
            System.out.print(i+" ");

            count++;
            System.out.println(count);
        }

    }
}

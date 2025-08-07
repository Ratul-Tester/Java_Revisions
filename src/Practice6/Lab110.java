package Practice6;

public class Lab110 {
    public static void main(String[] args) {
        System.out.println("Printing the value of i, but will break when i=6");
        for (int i=1;i<=10;i++){

            System.out.println(i);
            if (i==5){
                break;
            }
        }
    }
}

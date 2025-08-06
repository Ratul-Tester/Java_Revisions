package Practice6;

public class SimpleFor {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i<=10; i++){
            System.out.print(i+",");
            count++;
        }
        System.out.println("\nAnd the total count of numbers is: "+count);
    }
}

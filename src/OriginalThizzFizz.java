public class OriginalThizzFizz  {
    public static void main(String[] args) {
        for (int i=0;i<=100;i++){
            if (i%5 == 0 && i%3 == 0){
                System.out.println("ThizzFizz");
            } else if (i%3 == 0){
                System.out.println("Thizz");
            } else if (i%5 == 0){
                System.out.println("Thizz");
            } else {
                System.out.println(i);
            }
        }
    }
}

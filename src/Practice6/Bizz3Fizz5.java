package Practice6;

public class Bizz3Fizz5 {
    public static void main(String[] args) {
        for (int i = 1;i<=100;i++){
            if (i%3==0 && i%5==0){
                System.out.print(i+"Diviby3 & Diviby5"+"\n");
            } else if (i%3==0) {
                System.out.print(i+"Diviby3"+"\n");
            } else if (i%5==0) {
                System.out.print(i+"Diviby5"+"\n");
            } else {
                System.out.println(i);
            }
        }
    }
}

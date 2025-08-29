package Practice9;

public class ReturnWithNoParameter {
    public static void main(String[] args) {

        int result = SumOfTwoNumbers();
        System.out.println(result);

        int result1 = SumOfTwoNumbers(5,2);
        System.out.println(result1);

        int result2 = SubOfTwoNumbers(300,400);
        System.out.println(result2);
    }
    static int SumOfTwoNumbers(){
        return 2+3;
    }
    static int SumOfTwoNumbers(int a , int b){
        return a+b;
    }
    static int SubOfTwoNumbers(int a , int b){
        System.out.println(1-2);
        return 2-1;
    }
}

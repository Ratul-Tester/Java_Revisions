package Practice9;

public class DefiningCalling {
    public static void main(String[] args) {
        message();
        message1();
        message2();

    }

    static void message1() {
        System.out.println("Hi Welcome");
    }

    static void message(){
        System.out.println("Starting of Program");
    }

    static void message2(){
        System.out.println("End of Program");
    }
}

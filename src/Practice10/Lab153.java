package Practice10;

public class Lab153 {
    public static void main(String[] args) {
        //Non-return with no parameter
        saySomethingPlease();
        //Non-return with parameter
        saySomethingPlease("Ramesh");

        //Return with parameter
        int result2 = helpMe(3,5);
        System.out.println(result2);
        //Return with no parameter
        String ila = helpMe();
        System.out.println(ila);
    }

    static void saySomethingPlease(){
        System.out.println("This is a case of Non-return with no parameter");
    }
    static void saySomethingPlease(String name){
        System.out.println("Hello "+name+" This is a case of Non-return with parameter");
    }
    static String helpMe() {
        System.out.println("Return with no parameter");
        return helpMe();
    }
    static int helpMe(int a, int b){
        System.out.println(a+b+" This is a case of Return with parameter");
        return a+b;
    }
}

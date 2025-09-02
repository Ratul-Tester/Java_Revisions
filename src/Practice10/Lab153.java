package Practice10;

public class Lab153 {
    public static void main(String[] args) {
        //Non-return with no parameter
        saySomethingPlease();
        //Non-return with parameter
        saySomethingPlease("Ramesh");
        //Return with no parameter
        String ila = helpMe();
        System.out.println(ila);
    }

    static void saySomethingPlease(){
        System.out.println("Non-return with no parameter");
    }
    static void saySomethingPlease(String name){
        System.out.println("Hello "+name+" This is a case of Non-return with parameter");
    }
    static String helpMe() {
        System.out.println("Return with no parameter");
        return helpMe();
    }
}

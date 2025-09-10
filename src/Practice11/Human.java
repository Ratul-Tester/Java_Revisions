package Practice11;


public class Human {

    // Below are all Attributes....
    String name;
    String dob;
    double height;
    int age;
    String Class;
    String gender;
    boolean isMale;
    long phone_no;
    double Salary;
    String Occupation;


    // Below are the behaviours / methods / functions
    static void identity(){
        System.out.println("Below is the Identity of Human");
    }

    static String name(String name){
        System.out.println("The name is "+ name);
        return null;
    }

    public static int add(int a, int b){
        int sum = a+b;
        System.out.println("The sum of two numbers is : "+sum);
        return 0;
    }

    public static void main(String[] args) {
        identity();
        add(2,5);
    }

}

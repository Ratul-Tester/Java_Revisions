package Practice11;

import java.util.Scanner;

public class Human {
    Scanner sc = new Scanner(System.in);
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
    void identity(){
        System.out.println("Below is the Identity of Human");
    }
    String name(){
        System.out.println("The name is "+name);
        return "Bal";
    }

}

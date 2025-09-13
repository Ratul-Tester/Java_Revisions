package Oops;

public class ATBenrolled {
    //Below are the Instance Variables
    String name;
    String email;
    long phoneNo;
    String courseName;
    boolean isEnrolled;

    void printingDetails(){
        System.out.println("Printing the details of enrolled students");
    }

    ATBenrolled(){
        System.out.println("Default Constructor");
    }

    ATBenrolled(String name, String email, long phoneNo, String courseName, boolean isEnrolled) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.courseName = courseName;
        this.isEnrolled = isEnrolled;
    }

    ATBenrolled(String name){
        this.name = name;
        System.out.println(name);
    }

    ATBenrolled(String name, String email){
        this.name = name;
        this.email = email;
        System.out.println("The name is "+name+" and the email id is: "+email);
    }

    ATBenrolled(String name, String email, long phoneNo) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
    }
}

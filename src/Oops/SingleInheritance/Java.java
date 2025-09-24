package Oops.SingleInheritance;

public class Java {
    double Version;
    String Author;

    Java(){
        System.out.println("DC of Java");
    }

    Java(double version, String author) {
        Version = version;
        Author = author;
    }

    void printInfo(){
        System.out.println("Java version "+Version+" Author name is "+Author);
    }
}

package Oops.Single_Inheritance;

public class Java {
    String Author;
    double version;

    Java(){
        System.out.println("DC of Java");
    }

    Java(String author, double version) {
        Author = author;
        this.version = version;
    }

    void printInfo(){
        System.out.println("Java Author name is "+this.Author+" and the version of Java is "+this.version);
    }
}

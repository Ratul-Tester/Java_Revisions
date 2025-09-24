package Oops.SingleInheritance;

public class MongoDB {
    double Version;
    String Author;

    MongoDB(){
        System.out.println("DC of MongoDB");
    }

    MongoDB(double version, String author) {
        Version = version;
        Author = author;
    }

    void printInfo(){
        System.out.println("MongoDB version "+Version+" Author name is "+Author);
    }
}

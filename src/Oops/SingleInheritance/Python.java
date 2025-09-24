package Oops.SingleInheritance;

public class Python {
    double Version;
    String Author;

    Python(){
        System.out.println("DC of Python");
    }

    Python(double version, String author) {
        Version = version;
        Author = author;
    }

    void printInfo(){
        System.out.println("Python version "+Version+" Author name is "+Author);
    }
}

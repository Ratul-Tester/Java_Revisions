package Oops.Single_Inheritance_1to1;

public class Python {
    String Author;
    double version;

    Python(){
        System.out.println("DC of Python");
    }

    Python(String author, double version) {
        Author = author;
        this.version = version;
    }

    void printInfo(){
        System.out.println("Python Author name is "+this.Author+" and the version of Python is "+this.version);
    }
}

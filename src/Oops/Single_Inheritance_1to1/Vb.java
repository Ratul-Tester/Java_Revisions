package Oops.Single_Inheritance_1to1;

public class Vb {
    String Author;
    double version;

    Vb(){
        System.out.println("DC of Vb");
    }

    Vb(String author, double version) {
        Author = author;
        this.version = version;
    }

    void printInfo(){
        System.out.println("Vb Author name is "+Author+" and the version of Vb is "+version);
    }
}

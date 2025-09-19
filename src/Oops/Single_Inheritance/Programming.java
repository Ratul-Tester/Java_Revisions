package Oops.Single_Inheritance;

public class Programming {
    int version;
    String Author;

    Programming(){
        System.out.println("DC of Programing");
    }

    Programming(int version, String author) {
        this.version = version;
        Author = author;
    }

    void printInfo(){
        System.out.println(this.version+" is the latest version and "+Author+" is the Author");
    }
}

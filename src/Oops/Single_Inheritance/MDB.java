package Oops.Single_Inheritance;

public class MDB {
    String Author;
    double version;

    MDB(){
        System.out.println("DC of MDB");
    }

    MDB(String author, double version) {
        Author = author;
        this.version = version;
    }

    void printInfo(){
        System.out.println("MDB Author name is "+Author+" and the version of MDB is "+version);
    }
}

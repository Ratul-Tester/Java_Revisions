package Oops.SingleInheritance;

public class Programming {
    public static void main(String[] args) {
        Java j = new Java(1.23,"RAM");
        Python p = new Python(2.34,"SHIV");
        MongoDB m = new MongoDB(3.45,"RADHA");
        j.printInfo();
        p.printInfo();
        m.printInfo();



    }
}

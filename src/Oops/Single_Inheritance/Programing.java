package Oops.Single_Inheritance;

public class Programing {
    public static void main(String[] args) {
        Java j = new Java("Ramesh",10.012);
        Vb v = new Vb("Nani Wong",112.32);
        Python p = new Python("Papiya", 26.32);
        MDB m = new MDB("Bales Waha",21.02);

        j.printInfo();
        v.printInfo();
        p.printInfo();
        m.printInfo();
    }
}

package INHERITANCE.Single;

public class LabRunner {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Tesla", 101.01);
        v.printInfo();

        Vehicle v1 = new Audi_Bodii();
        v1.printInfo();

    }
}

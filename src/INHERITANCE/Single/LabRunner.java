package INHERITANCE.Single;

public class LabRunner extends BMW {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Tesla", 101.01);
        v.printInfo();
        System.out.println("***********************************************");
        Vehicle v1 = new Audi_Bodii();
        v1.printInfo();
        System.out.println("***********************************************");
        Vehicle v2 = new BMW();
        v2.printInfo();
    }
}

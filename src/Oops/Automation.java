package Oops;

public class Automation {
    String name;
    Automation(){
        databaseConnection();
        excelOpen();
    }

    public Automation(String name) {
        this.name = name;
        //System.out.println(name);
    }

    void databaseConnection() {
        System.out.println("Database connection established");
    }

    void excelOpen() {
        System.out.println("Excel opens for operation");
    }

    void testCase1(){
        System.out.println("test case 1 "+this.name);
    }

    void testCase2(){
        System.out.println("test case 2 "+this.name);
    }

    public static void main(String[] args) {
        Automation auto = new Automation();
        //Automation auto1 = new Automation("Automation Started");
        Automation t1 = new Automation("Test1");
        Automation t2 = new Automation("Test2");

        t1.databaseConnection();
        System.out.println(t1.name);

        t1.testCase1();
        t1.testCase2();
        System.out.println(t2.name);
        t2.excelOpen();
        t2.testCase1();
        t2.testCase2();
    }
}

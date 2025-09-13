package Oops;

public class Automation {
    String name;
    Automation(){
        databaseConnection();
        excelOpen();
    }

    void databaseConnection() {
        System.out.println("Database connection established");
    }

    void excelOpen() {
        System.out.println("Excel opens for operation");
    }

    public static void main(String[] args) {
        Automation auto = new Automation();
    }
}

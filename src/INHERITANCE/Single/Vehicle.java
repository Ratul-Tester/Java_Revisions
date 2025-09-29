package INHERITANCE.Single;

public class Vehicle {

    String Model = "Default Vehicle";
    Double Version = 0.00;

    public Vehicle() {
        System.out.println("DC of Vehicle");
    }

    public Vehicle(String model, Double version) {
        Model = model;
        Version = version;
    }

    public void printInfo(){
        System.out.println("The vehicle model is "+Model+" and the version is "+Version);
    }
}

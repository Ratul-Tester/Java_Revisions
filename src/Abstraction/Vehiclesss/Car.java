package Abstraction.Vehiclesss;


abstract class Car {
    public Car() {
        System.out.println("DC of Car");
    }

    abstract String fuel();
    abstract String engineCapacity();
    abstract String hp();

    void printLog(){
        System.out.println("Print Logs");
    }
}

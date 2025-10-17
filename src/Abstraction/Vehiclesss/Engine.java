package Abstraction.Vehiclesss;

public class Engine extends Car{
    @Override
    String fuel() {
        System.out.println("The fuel type is Petrol");
        return "";
    }

    @Override
    String engineCapacity() {
        System.out.println("The Engine Capacity is 4.2 lts");
        return "";
    }

    @Override
    String hp() {
        System.out.println("The top speed is 600 Hp");
        return "";
    }
}

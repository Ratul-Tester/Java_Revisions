package Polymorphism.MethodOverRiding;

class car {
    void run (){
        System.out.println("car runs faster");
    }
}
class bike extends car{
    void run (){
        System.out.println("Bike is running smoothly");
    }
}
public class Vehicle {
    public static void main(String[] args) {

        car c = new car();
        c.run(); // car runs faster
        car c1 = new bike();
        c1.run(); // Bike is running smoothly
    }
}

package Polymorphism.MethodOverRiding;

public class Dog extends Animal{
    @Override
    void sound() {
        //super.sound();
        System.out.println("Dog Barks");
    }
}

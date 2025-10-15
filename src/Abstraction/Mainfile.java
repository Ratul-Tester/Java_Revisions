package Abstraction;

public class Mainfile {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}

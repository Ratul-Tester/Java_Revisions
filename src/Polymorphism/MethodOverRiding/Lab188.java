package Polymorphism.MethodOverRiding;

public class Lab188 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound(); // Dog Barks
        System.out.println("**************");
        Animal b = new Animal();
        b.sound(); // Animal makes sounds
    }
}

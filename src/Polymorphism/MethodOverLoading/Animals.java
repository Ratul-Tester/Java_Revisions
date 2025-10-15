package Polymorphism.MethodOverLoading;

public class Animals {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.sound("Germansephard"));
        Cow c = new Cow();
        System.out.println(c.sound("Jersey"));
    }
}
class Dog{
    String sound(String species){
        System.out.println(species+" Barks");
        return species;
    }
}
class Cow{
    String sound(String species){
        System.out.println(species+" Mows");
        return species;
    }
}
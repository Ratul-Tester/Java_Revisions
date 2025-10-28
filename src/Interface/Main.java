package Interface;

interface Animal {
    abstract void species();
}
interface AnimalVoice {
    abstract void sound();
}
class Dog implements Animal, AnimalVoice{
    @Override
    public void species() {
        System.out.println("Dog is a Animal Species");
    }

    @Override
    public void sound() {
        System.out.println("Dog Barks");
    }
}
public class Main{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.species();
        d.sound();
    }
}
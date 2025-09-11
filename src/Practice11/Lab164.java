package Practice11;

public class Lab164 extends Dog{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Bravo";
        dog.breed = "German shephard";
        dog.color = "Spotted Black";
        dog.lifeSpan = 12;
        System.out.println("Name of the Dog is: "+dog.name);
        System.out.println("Dog Breed is: "+dog.breed);
        System.out.println("Dog color is: "+dog.color);
        System.out.println("Lifespan of Dog is: "+dog.lifeSpan);

        diet();
        biteForce();

    }

}

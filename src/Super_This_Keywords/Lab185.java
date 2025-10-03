package Super_This_Keywords;

public class Lab185 {
    public static void main(String[] args) {
        Animal a = new Animal("DOG");
        System.out.println(a);
        System.out.println("**********************************");
        Dog d = new Dog();
        d.display();
        System.out.println("**********************************");
        Dog d1 = new Dog("coco");
        d1.display();
        System.out.println("**********************************");
        Dog d2 = new Dog("coco","domestic pet");
        d2.display();
        System.out.println("**********************************");
        Dog d3 = new Dog("coco","Domestic Pet", 10);
        d3.display();
        System.out.println("**********************************");

    }
}
class Animal{
    String type;
    Animal(){
        System.out.println("Default Constructor of Animal");
    }
    Animal(String type){
        this.type = type;
        System.out.println("Parameterized Constructor with one argument String Type");
    }
}
class Dog extends Animal{
    String breed;
    int ls;
    Dog(){
        super();
        System.out.println("Default Constructor of Dog");
    }
    Dog(String breed){
        this.breed=breed;
        System.out.println("Parameterized Constructor with one argument String Breed");
    }
    Dog(String breed, String type){
        this("Breed set by Dog only");
        this.breed=breed;
        this.type=type;
        System.out.println("Parameterized Constructor with two argument String Breed and String Type");
    }
    Dog(String breed, String type, int ls){
        this("Breed set by Dog only", "Type set by Dog only");
        this.breed=breed;
        this.type=type;
        this.ls=ls;
        System.out.println("Parameterized Constructor with three argument String Breed, String Type and int ls");
    }
    void display(){
        System.out.println("Type: "+type+", Breed: "+breed);
    }


}
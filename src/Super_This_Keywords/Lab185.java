package Super_This_Keywords;

public class Lab185 {
    public static void main(String[] args) {
        Dog d = new Dog();
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
}
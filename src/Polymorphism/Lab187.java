package Polymorphism;

public class Lab187 {
    public static void main(String[] args) {
        System.out.println("Polymorphism --> Meaning \n'Many forms'\nIt allows one task to be performed in different ways" +
                "\nMainly through method overloading and method overriding" +
                "\nExample" +
                "\nClass Animal{" +
                "\n  void sound(){" +
                "\n     System.out.println('Animal makes a sound');" +
                "\n  }" +
                "\n}" +
                "\nclass Dog extends Animal{" +
                "\n  void sound(){" +
                "\n     System.out.println('Dog Barks');" +
                "\n  }" +
                "\n}" +
                "\npublic class Main{" +
                "\n  public static void main(String[] args){" +
                "\n    Animal a = new Dog(); // Parent reference, Child Object" +
                "\n       a.sound(); // Output: Dog Barks" +
                "\nHere, the same method sound() works differently depending on the object");
    }
}

package Oops.Multilevel_Inheritance;

public class Lab177 {
    public static void main(String[] args) {
        Grandfather gf = new Grandfather();
        Grandfather f = new Father();
        Grandfather c = new Child();

        Father f1 = new Father();
        Father gf1 = new Grandfather();
        Father c1 = new Child();
    }
}

package Oops.Multilevel_Inheritance;

public class Lab177 {
    public static void main(String[] args) {
        Grandfather gf = new Grandfather();
        Grandfather f = new Father();
        Grandfather c = new Child();

        Father f1 = new Father();
        f1.extra();
        f1.home();

        //Father gf1 = new Grandfather();//Not possible
        Father c1 = new Child();
        c1.extra();
        c1.home();
    }
}

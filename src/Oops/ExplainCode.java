package Oops;

public class ExplainCode {
    public static void main(String[] args) {
    //GrandFather g = new GrandFather();// Grandfather has 1 BHK
    //GrandFather g = new Father();// Father has 2 BHK
    GrandFather g = new son();// Son has 3BHK
    g.home();
    }
}

class son extends Father {
    void home(){
        System.out.println("Son has 3BHK");
    }
        }

class Father extends GrandFather{
    void home(){
        System.out.println("Father Has 2bhk");
    }
}

class GrandFather{
    void home(){
        System.out.println("Grandfather has 1 BHK");
    }
}
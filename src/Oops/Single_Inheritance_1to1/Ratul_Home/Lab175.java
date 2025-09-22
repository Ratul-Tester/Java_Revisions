package Oops.Single_Inheritance_1to1.Ratul_Home;

public class Lab175 {
    public static void main(String[] args) {
        Ram ref = new Ram();
        ref.bhk2();

        Sister s = new Sister();
        //s.bhk2() is not available as class Sister not extended to father
    }
}

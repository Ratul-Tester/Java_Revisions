package Oops.Single_Inheritance;

public class Java extends Programming {
    String newFeature;

    Java(){
        System.out.println("DC of Java");
    }

    Java(String newFeature) {
        this.newFeature = newFeature;
    }

    void printInfo(){
        System.out.println(this.newFeature+" is the latest feature of Java");
    }
}

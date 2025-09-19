package Oops.Single_Inheritance;

public class Python extends Programming {
    String newFeature;

    Python(){
        System.out.println("DC of Python");
    }

    Python(String newFeature) {
        this.newFeature = newFeature;
    }

    void printInfo(){
        System.out.println(this.newFeature+" is the latest feature of Python");
    }
}

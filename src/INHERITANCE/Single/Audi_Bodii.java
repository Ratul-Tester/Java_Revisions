package INHERITANCE.Single;

public class Audi_Bodii extends Vehicle{

    String Model = "Audi_Bodii";
    //Double Version = 1.26;

    public Audi_Bodii(){
        System.out.println("DC of Audi_Bodii");
    }

        public void printInfo() {
            System.out.println("The vehicle model is "+Model+" and the version is "+Version);
    }
}

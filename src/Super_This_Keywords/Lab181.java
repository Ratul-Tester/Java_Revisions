package Super_This_Keywords;

public class Lab181 {
    public static void main(String[] args) {
        car c = new car();
        c.display();
    }
}

class vehicle{
    int maxSpeed = 320;

    void message(){
        System.out.println("This is vehicle class");
    }
//    vehicle(){
//        System.out.println("DC of vehicle");
//    }
//    vehicle(int maxSpeed){
//        System.out.println("The maxSpeed of a vehicle is "+maxSpeed);
//    }
//    public void display(){
//        System.out.println("The Maximum Speed of vehicle is "+maxSpeed);
//    }

}

class car extends vehicle{
    int maxSpeed = 180;
    void display(){
        System.out.println("Max Speed of Vehicle can be "+super.maxSpeed);
        System.out.println("And the Max Speed of Car is "+this.maxSpeed);
    }
//    car(){
//        System.out.println("DC of the Car");
//    }
//    car(int maxSpeed){
//        System.out.println("The Maximum Speed of car is "+maxSpeed);
//    }
}
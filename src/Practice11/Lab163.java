package Practice11;

public class Lab163 extends car{
    public static void main(String[] args) {
        System.out.println("Let's Try");
        car Cars = new car();
        Cars.name = "Tesla";
        System.out.println("The Car Name is: "+Cars.name);
        Cars.model = "ELETRO-VTX";
        System.out.println("The Car Model is: "+Cars.model);
        Cars.color = "Metallic Black";
        System.out.println("The Car color is: "+Cars.color);
        Cars.tyres = "Jumbo Tubeless";
        System.out.println("The Car tyres are: "+Cars.tyres);
        Cars.size = 2300;
        System.out.println("The Car size is: "+Cars.size+" DC");

        topSpeed();
        innerSpace();
        musicSystem();
        gstPrice(12.6);
    }
}

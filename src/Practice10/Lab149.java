package Practice10;

public class Lab149 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            age();
            names();
            department();            
        }
    }

    static void names() {
        System.out.println("Name is Partha");
    }

    static void department() {
        System.out.println("CBT Department");
    }

    static void age() {
        System.out.println("The age is 29");
    }
}

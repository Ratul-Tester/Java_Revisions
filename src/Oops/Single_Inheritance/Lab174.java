package Oops.Single_Inheritance;

public class Lab174 {
    public static void main(String[] args) {
        Programming p = new Programming(107,"Wang Lee");
        Java j = new Java("Advanced Multitasking");
        Python py = new Python("New");

        p.printInfo();
        j.printInfo();
        py.printInfo();

        Programming p1 = new Programming(108,"Chung Su");
        p1.printInfo();
        Java j1 = new Java("Reversal Prop");
        j1.printInfo();
        Python py1 = new Python("Hi Hi");
        py1.printInfo();
    }
}

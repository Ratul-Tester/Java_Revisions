package Oops;

public class RunnerClass {
    public static void main(String[] args) {
        ATBenrolled atb1 = new ATBenrolled();
        atb1.name = "Raty";

//        ATBenrolled atb2 = new ATBenrolled();
//        atb2.name = "Baty";
//        System.out.println(atb2.name);
        ATBenrolled atb2 = new ATBenrolled("Raty","ratul@gmail.com",8895566483l,"ATB6x",true);
        ATBenrolled atb3 = new ATBenrolled("Narmata","narmatapriyadarsini@gmail.com",123456789l,"ABT6x",false);
        ATBenrolled atb4 = new ATBenrolled("Tapu","tapatap@gmail.com",123456789l);
        ATBenrolled atb5 = new ATBenrolled("Ganesh","baba@gmail.com",0000l);

        System.out.println(atb1.name.replaceAll("Raty","Ratul"));
        System.out.println(atb2.name);
        System.out.println(atb3.name);
        System.out.println(atb4.name);
        System.out.println(atb5.name);

        ATBenrolled atb6 = new ATBenrolled("Ramesh");
        ATBenrolled atb7 = new ATBenrolled("Bhubesw","bhu@goo.com");

    }

}

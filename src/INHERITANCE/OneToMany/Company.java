package INHERITANCE.OneToMany;

public class Company {
    int Salary = 10000;
    Company(){
        System.out.println("DC of Company");
    }

    public void printInfo(){
        System.out.println("Company base salary is "+Salary);
    }
}

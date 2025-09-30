package INHERITANCE.OneToMany;

public class Employee extends Company {
    Employee(){
        System.out.println("DC of Employee");
    }

    public void printInfo() {
        Salary = Salary+450;
        System.out.println("The salary of Employee is "+Salary);
    }
}

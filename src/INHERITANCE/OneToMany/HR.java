package INHERITANCE.OneToMany;

public class HR extends Company{
    HR(){
        System.out.println("DC of HR");
    }
    public void printInfo(){
        Salary = Salary+500;
        System.out.println("The Salary of HR "+Salary);
    }
}

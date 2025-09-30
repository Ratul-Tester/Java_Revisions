package INHERITANCE.OneToMany;

public class RunnerOnetoMany {
    public static void main(String[] args) {

        Company c = new Company();
        c.printInfo();
        System.out.println("--------------------");
        HR h = new HR();
        h.printInfo();
        System.out.println("--------------------");
        Employee e = new Employee();
        e.printInfo();


    }
}

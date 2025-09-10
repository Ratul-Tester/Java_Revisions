package Practice11;

public class Lab161 extends Human {
    public static void main(String[] args) {
        Human old = new Human();
        old.name = "Ratul";
        old.dob = "26/11/1987";
        old.height = 5.96;
        old.Class = "General";
        old.gender = "Male";
        old.isMale = true;
        old.phone_no = 8895566483l;
        old.Salary = 45000;
        old.Occupation = "Software Engineer";
        old.age = 20;
        System.out.println(old.name);
        System.out.println(old.dob);
        System.out.println(old.height);
        System.out.println(old.age);
        System.out.println(old.Class);
        System.out.println(old.gender);
        System.out.println(old.isMale);
        System.out.println(old.phone_no);
        System.out.println(old.Salary);
        System.out.println(old.Occupation);

    }
}

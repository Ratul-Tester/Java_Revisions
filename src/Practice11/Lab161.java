package Practice11;

public class Lab161  {
    public static void main(String[] args) {
        Human old = new Human();
        System.out.println("Hi");
        old.name = "Ratul";
        old.dob = "26/11/1987";
        old.height = 5.72;
        old.Class = "General";
        old.gender = "Male";
        old.isMale = true;
        old.phone_no = 8895566483l;
        old.Salary = 45000;
        old.Occupation = "Software Engineer";
        old.age = 20;
        System.out.println(old.name);
        System.out.println("Your date of birth is "+old.dob);
        System.out.println("Your height is "+old.height+" inches");
        System.out.println("Your age is "+old.age);
        System.out.println("Your class is "+old.Class);
        System.out.println("Your gender is "+old.gender);
        System.out.println("Your gender is male :"+old.isMale);
        System.out.println("Your contact no. is "+old.phone_no);
        System.out.println("Your current salary is "+old.Salary);
        System.out.println("And your occupation is "+old.Occupation);

    }
}

package Super_This_Keywords;


public class Lab184 {
    public static void main(String[] args) {
        person1 p = new person1("Bala",10);
        p.show();
        System.out.println("**********************************");
        person1 c1 = new student("lala");
        c1.show();

    }
}

class person1 {
    person1(){
        System.out.println("Default constructor of person1");
    }
    person1(String a){
        System.out.println("Parameterized Constructor with one Argument String a");
    }
    person1(String a, int a1){
        System.out.println("Parameterized Constructor with two Argument String a and int a1");
    }
    void show(){
        System.out.println("Person1");
    }
}

class student extends person1{
    student(){
        System.out.println("Default constructor of student");
    }
    student(String b){
        System.out.println("Parameterized Constructor with one Argument String b");
    }

    void show() {
        super.show();
        this.show();
    }
}
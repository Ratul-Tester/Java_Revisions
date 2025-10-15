package Encapsulation;

public class School {
    public static void main(String[] args) {
        student s = new student();
        s.setName("Ratul");
        System.out.println(s.getName());
    }
}
class student{
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }
}

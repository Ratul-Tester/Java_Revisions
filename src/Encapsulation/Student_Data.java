package Encapsulation;

public class Student_Data {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setStu_Name("Ramesh");
        stu.setStu_Id(24716021);
        System.out.println("Student Name is: "+stu.getStu_Name());
        System.out.println("Student ID is: "+stu.getStu_Id());
    }
}
class Student{
    private String Stu_Name;
    private int Stu_Id;

    public String getStu_Name() {
        return Stu_Name;
    }

    public void setStu_Name(String n) {
        Stu_Name = n;
    }

    public int getStu_Id() {
        return Stu_Id;
    }

    public void setStu_Id(int i) {
        if(i>0) {
            Stu_Id = i;
        }
    }
}

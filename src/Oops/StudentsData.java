package Oops;

public class StudentsData {
    String name;
    int regsno;
    String batch;

    StudentsData(){
        System.out.println("Printing Details of student data...");
        name = "Student Name";
        regsno = 00000;
        batch = "Student Batch";
    }

    public StudentsData(String name, int regsno) {
        this.name = name;
        this.regsno = regsno;
    }

    public StudentsData(String name, int regsno, String batch) {
        this.name = name;
        this.regsno = regsno;
        this.batch = batch;
    }

    void printDetails(){
        System.out.println("The name of the student is "+name+" and registration no. is "+regsno+" of batch / academic year "+batch);
    }
}

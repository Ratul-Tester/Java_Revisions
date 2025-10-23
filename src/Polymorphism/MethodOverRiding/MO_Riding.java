package Polymorphism.MethodOverRiding;

public class MO_Riding {
    public static void main(String[] args) {
        Subject s = new Subject();
        s.e("Subject",100);
        System.out.println("********************************");
        Subject sm = new Math();
        sm.e("Maths",89);
        System.out.println("********************************");
        Subject ss = new Science();
        ss.e("Science",94);
    }

}
class Subject{
    String sName;
    int sMarks;

    void e(String sName, int sMarks){
        System.out.println("subject --> full marks : "+(sName+sMarks));
    }
}
class Math extends Subject{
    @Override
    void e(String sName, int sMarks){
        System.out.println("marks in --> subject : "+(sMarks+sName));
    }
}
class Science extends Subject{
    @Override
    void e(String sName, int sMarks){
        System.out.println("subject in -->  marks : "+(sName+sMarks));
    }
}
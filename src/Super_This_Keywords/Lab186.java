package Super_This_Keywords;

public class Lab186 {
    public static void main(String[] args) {
        method m = new method();
        m.m2();
    }
}
class method{
    void m1(){
        System.out.println("M1");
    }
    void m2(){
        m1();
        System.out.println("M2");
    }
}
package Super_This_Keywords;

public class Lab186 {
    public static void main(String[] args) {
<<<<<<< HEAD
//        maths m = new maths();
//        maths m1 = new maths("Paper1");
        maths m2 = new maths("Paper1","maths1");
        m2.display();
    }
}
class subject{
    String name;
    subject(){
        System.out.println("DC of subject");
    }
    subject(String subName){
        this.name=subName;
        System.out.println("PC of subject with 1 argument");
    }
}
class maths extends subject{
    String paper;
    maths(){
        System.out.println("DC of maths");
    }
    maths(String paperName){
        super("math");
        this.paper=paperName;
        System.out.println("PC of maths with 1 argument");
    }
    maths(String paperName, String name){
        super(name);
        this.paper=paperName;
        System.out.println("PC of maths with 2 argument");
    }
    void display(){
        System.out.println("name: "+name+", paper: "+paper);
=======
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
>>>>>>> a8de94bfba1a0194dd11823a78cb215a1a5d5def
    }
}
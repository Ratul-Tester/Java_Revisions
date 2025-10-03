package Super_This_Keywords;

public class Lab183 {
    public static void main(String[] args) {
        addition m = new addition();
        m.message();
        m.display();

    }
}
class math {
    void message(){
        System.out.println("This is Math Class");
    }
}


class addition extends math{
    void message(){
        System.out.println("This is addition");
    }

    void display(){
        super.message();
        this.message();
    }
}
class substraction extends addition{
    void message(){
        System.out.println("This is Substraction");
    }

    void display(){
        super.message();
        this.message();
    }
}
package Super_This_Keywords;

public class Lab181a {
    public static void main(String[] args) {
        girl b = new boy();
        b.message();
    }
}
class boy extends girl {
    String Boy;
    void message(){
        System.out.println("I am a Boy");
    }
    void display(){
        //this.message();
        super.message();
    }
}
class girl {
    void message(){
        System.out.println("I am a girl");
    }
}
package Interface;

public class Interface_3in1 {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.type();
        d.color();
        Animals.info();
    }
}
interface Animals{
    void type();

    default void color(){
        System.out.println("In color by default it is black");
    }

    static void info(){
        System.out.println("All Animals can make sound");
    }
}
class Dogs implements Animals{
    @Override
    public void type() {
        System.out.println("Type of Animal is Domestic");//+String.class
    }

    @Override
    public void color() {
        System.out.println("Common color is Brown");
    }
}

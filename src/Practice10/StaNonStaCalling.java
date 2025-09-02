package Practice10;

public class StaNonStaCalling {
    int x =10;
    static int y = 20;
    int z = y;
    public static void main(String[] args) {
        StaNonStaCalling t = new StaNonStaCalling();
        System.out.println(t.x);
        System.out.println(y);
        System.out.println(StaNonStaCalling.y);
        System.out.println(t.z);
    }
}

package Practice1;

public class MadJVM {
    public static void main(String[] args) {

        for(byte b= -128; b <= 126; b++){
            System.out.print(b);
            b++;
            System.out.println(b);
        }
    }
}

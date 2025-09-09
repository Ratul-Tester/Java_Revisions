package Practice10;

public class Lab155 {
    public static void main(String[] args) {
        System.out.println("Starting of the Program");
        int interest = giveMoneyFriend(100);
        System.out.println(interest);
        giveMoneyBeg();
        System.out.println("End of the Program");
    }

    static int giveMoneyFriend(int i) {
        i=i+8;
        return i+2;
    }

    static void giveMoneyBeg() {
        System.out.println("Gives Blessings");
    }

}

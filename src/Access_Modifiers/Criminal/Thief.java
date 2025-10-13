package Access_Modifiers.Criminal;

import Access_Modifiers.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop c = new Cop(10);
        System.out.println(c.gun);
       // c.canIShoot();
    }
}

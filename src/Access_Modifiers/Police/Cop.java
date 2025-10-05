package Access_Modifiers.Police;

public class Cop {
    public int gun;
    private String IdCard;

    public Cop(int gun){
        this.gun=gun;
    }

    protected void canIShoot(){
        System.out.println("As you are a cop, you can shoot");
    }
}

package Access_Modifiers.Doctor;

public class OTroom {
    public int bill;
    private String instruments;

    public OTroom(int bill){
        this.bill=bill;
        System.out.println("The patient bill no. is: "+bill);
    }

    protected void operation(){
        System.out.println("Doctor is allowed only to do operation");
    }
}

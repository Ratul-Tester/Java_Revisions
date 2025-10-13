package Access_Modifiers.Patient;

import Access_Modifiers.Doctor.OTroom;

public class PatientWard {
    public static void main(String[] args) {
        OTroom ot = new OTroom(121);
        System.out.println(ot.bill+" is the bill number"); // OTroom bill is public which is accessible
        //ot.operation(); // In patient ward operation cannot be performed as it is private in nature
    }
}

package Oops;

public class StaffDetails {
    public static void main(String[] args) {
        CBTSps Default = new CBTSps();
        Default.printDetails();

        CBTSps sl1 = new CBTSps("CBT","HOD","Prof. Sanghamitra Nayak","s.nayak@soa.ac.in",9080706050d);
        CBTSps sl2 = new CBTSps("CBT","Teaching","Prof. Laxmikanta Acharya","l.acharya@soa.ac.in",7060504030d);
        CBTSps sl3 = new CBTSps("SPS","Non-Teaching","Mr. Biswal","biswal@soa.ac.in",6050403020d);
        CBTSps sl4 = new CBTSps("CBT","Non-Teaching","Mrs. Kar","n.mishra@soa.ac.in",5040302010d);
        CBTSps sl5 = new CBTSps("CBT","Mr. Dharmendra",8899774455d,"");

        CBTSps[] staffs = {sl1,sl2,sl3,sl4,sl5};

        for (int i = 0; i < staffs.length; i++) {
            staffs[i].printDetails();
        }
    }
}

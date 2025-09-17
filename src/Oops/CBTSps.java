package Oops;

public class CBTSps {
    String Department;
    String StaffClass;
    String StaffName;
    String StaffEmailID;
    double StaffMobileNo;

    CBTSps(){
        Department = "CBT / SPS";
        StaffClass = "Teaching / Non-Teaching / Attendant";
        StaffName = "Proff. , Dr. , Mr. ";
        StaffEmailID = "xyz@soa.ac.in";
        StaffMobileNo = 1234567890;
    }

    public CBTSps(String department, String staffClass, String staffName, String staffEmailID, double staffMobileNo) {
        Department = department;
        StaffClass = staffClass;
        StaffName = staffName;
        StaffEmailID = staffEmailID;
        StaffMobileNo = staffMobileNo;
    }

    public CBTSps(String department, String staffName, double staffMobileNo, String staffClass) {
        Department = department;
        StaffName = staffName;
        StaffMobileNo = staffMobileNo;
        StaffClass = staffClass;
    }

    void printDetails(){
        System.out.println("In "+Department+", "+StaffName+" is a "+StaffClass+" Staff having email id: "+StaffEmailID+" and Mobile no. is "+StaffMobileNo);
    }
}

package Encapsulation;

public class Office {
    public static void main(String[] args) {
        subOffice so = new subOffice();
        so.setDept("CBT");
        so.setEmpID("126");
        System.out.println(so.getEmpID());
        System.out.println(so.getDept());
    }
}
class subOffice {

        private String empID;
        private String dept;

        public String getEmpID() {
        return empID;
    }

        public void setEmpID(String empID) {
        this.empID = empID;
    }

        public String getDept() {
        return dept;
    }

        public void setDept(String dept) {
        this.dept = dept;
    }
}


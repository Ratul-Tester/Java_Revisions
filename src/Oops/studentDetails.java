package Oops;

public class studentDetails {
    public static void main(String[] args) {

        StudentsData Default = new StudentsData();
        Default.printDetails();
        System.out.println("-----------------------------");
        StudentsData r0 = new StudentsData("Puja Piri", 226162, "2022-23");
        StudentsData r1 = new StudentsData("Sasmita Nayak", 226173, "2022-23");
        StudentsData r2 = new StudentsData("Susmita Dash", 226022, "2022-23");
        StudentsData r3 = new StudentsData("Pramod Dutta", 226782, "2022-23");
        StudentsData r4 = new StudentsData("Ratul Nandy", 226742, "2022-23");
        StudentsData r5 = new StudentsData("Narmat Priyadarshini", 226742);
        StudentsData r6 = new StudentsData("Sahadev Suna", 22616345);

        StudentsData[] Students = {r0,r1,r2,r3,r4,r5,r6};

        for (int i = 0; i < Students.length; i++) {
            Students[i].printDetails();
        }


    }

}

package Oops;

public class BankRunner {
    public static void main(String[] args) {
        BankAccount Default = new BankAccount();
        Default.PrintDetails();
        System.out.println("**********************************");
        BankAccount SBI = new BankAccount("SBI Bank","SBINC002",12000);
        SBI.PrintDetails();
        System.out.println("**********************************");
        BankAccount HDFC = new BankAccount("HDFC Bank","IHDFC001",25600);
        HDFC.PrintDetails();
        System.out.println("**********************************");
        BankAccount YES = new BankAccount("YES Bank","YESK009");
        YES.PrintDetails();
    }
}

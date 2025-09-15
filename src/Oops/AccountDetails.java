package Oops;

public class AccountDetails {
    public static void main(String[] args) {
        BankingDetails Default = new BankingDetails();
        Default.printDetails();
        System.out.println("***********************");
        BankingDetails SBI = new BankingDetails("SBI", "SBINX001", 12659);
        BankingDetails HDFC = new BankingDetails("HDFC", "HDFCXNI001");
        BankingDetails ICICI = new BankingDetails(12587945.58);
        SBI.printDetails();
        System.out.println("***********************");
        HDFC.printDetails();
        System.out.println("***********************");
        ICICI.printDetails();
    }
}

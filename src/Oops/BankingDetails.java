package Oops;

public class BankingDetails {
    String bankName;
    String bankCode;
    double balance;

    BankingDetails(){
        System.out.println("Default Banking Details");
        bankName = "DefaultBank";
        bankCode = "DefaultCode";
        balance = 00.00d;
    }

    public BankingDetails(String bankName, String bankCode, double balance) {
        this.bankName = bankName;
        this.bankCode = bankCode;
        this.balance = balance;
    }

    public BankingDetails(String bankName, String bankCode) {
        this.bankName = bankName;
        this.bankCode = bankCode;
    }

    public BankingDetails(double balance) {
        this.balance = balance;
    }

    void printDetails(){
        System.out.println("The bank name is "+bankName);
        System.out.println("The bank code is "+bankCode);
        System.out.println("The bank balance is "+balance);
    }
}

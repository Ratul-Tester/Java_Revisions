package Oops;

public class BankAccount {
    String BankName;
    String BankCode;
    long Balance;

    BankAccount(){
        BankName = "DefaultBankName";
        BankCode = "XXOP000";
        Balance = 0;
    }

    BankAccount(String bankName, String bankCode, long balance) {
        BankName = bankName;
        BankCode = bankCode;
        Balance = balance;
    }

    BankAccount(String bankName, String bankCode) {
        BankName = bankName;
        BankCode = bankCode;
    }

    void PrintDetails(){
        System.out.println("Bank Name is :"+BankName);
        System.out.println("Bank Code is :"+BankCode);
        System.out.println("Bank Balance is :"+Balance);
    }
}

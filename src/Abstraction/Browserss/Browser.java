package Abstraction.Browserss;

public class Browser {
    public static void main(String[] args) {
        TC1_Chrome tc = new TC1_Chrome();
        tc.openBrowser();
        tc.closeBrowser();
        System.out.println("*********************************");
        TC2_Firefox f = new TC2_Firefox();
        f.openBrowser();
        f.closeBrowser();
        System.out.println("*********************************");

    }
}

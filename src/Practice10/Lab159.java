package Practice10;

public class Lab159 {
    public static void main(String[] args) {
        // Web Automation
        openBrowser();
        testLoginPage();
        testInnerPage("Page 1");
        closeBrowser();
    }
    static void openBrowser(){
        System.out.println("Opening Browser.......");
    }
    static void testLoginPage(){
        System.out.println("Testing Login Page");
    }
    static void testInnerPage(String a){
        System.out.println(a);
    }
    static void closeBrowser(){
        System.out.println(".......Browser closing");
    }
}

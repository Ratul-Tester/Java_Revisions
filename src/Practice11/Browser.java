package Practice11;

public class Browser {
    String browser;
    String openingMessage;
    String closingMessage;

    static void selectBrowser(String browser){
        System.out.println("You have chosen "+browser+" Browser");
    }
    static void openingMessage(String browser){
        System.out.println(browser+" browser is opening");
    }
    static void closingMessage(String browser){
        System.out.println(browser+" browser is closing");
    }
}

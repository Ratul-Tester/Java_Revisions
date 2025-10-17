package Abstraction;

public class TC2_Firefox extends BaseCLass{
    @Override
    String openBrowser() {
        System.out.println("Firefox is starting...............");
        return "";
    }

    @Override
    String closeBrowser() {
        System.out.println("Firefox is closing..................");
        return "";
    }
}

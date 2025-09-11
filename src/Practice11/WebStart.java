package Practice11;


public class WebStart extends Browser{
    public static void main(String[] args) {
        Browser br = new Browser();
        br.browser = "Chrome";

        selectBrowser("Chrome");
        openingMessage("Chrome");
        closingMessage("Chrome");



    }
}

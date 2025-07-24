package Practice4;

import java.util.Scanner;

public class BrowserSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("On which browser you want to execute, Please enter browser name:");
        String bname = sc.next();
        bname = bname.toLowerCase();

        switch (bname){
            case "chrome":
                System.out.println("The browser you have selected is :"+bname+"\n Opening Chrome 4.12 .......");
                break;
            case "explorer":
                System.out.println("The browser you have selected is :"+bname+"\n Opening Internet Explorer 3.8 .......");
                break;
            case "mozila":
                System.out.println("The browser you have selected is :"+bname+"\n Opening Mozila Firefox 4.01 .......");
                break;
            case "safari":
                System.out.println("The browser you have selected is :"+bname+"\n Opening Safari 3.9 .......");
                break;
            default:
                System.out.println("Sorry i didn't recognise");
        }
    }
}

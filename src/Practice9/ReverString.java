package Practice9;

public class ReverString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("I Love You");
        StringBuffer reverse = sb.reverse();
        System.out.println(reverse);
        StringBuilder striBui = new StringBuilder("Rama Rama");
        StringBuilder re = striBui.reverse();
        System.out.println(re);
    }
}

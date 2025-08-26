package Practice9;

public class Strreverse {
    public static void main(String[] args) {
        String[] str = {"Hare","Rama","Hare","Krishna"};
        for (int i = str.length - 1; i >= 0 ; i--) {
            System.out.print(str[i]+" ");
        }
        System.out.println("\n------------");
        String str1 = "Krishna";
        for (int i = str1.length()-1; i >= 0 ; i--) {
            System.out.print(str1.charAt(i));
        }
        System.out.println("\n-------------");
        StringBuffer str2 = new StringBuffer(str1);
        str2.reverse();
        System.out.println(str2);
        System.out.println("-------------");
        StringBuilder str3 = new StringBuilder(str2);
        str3.reverse();
        System.out.println(str3);
        System.out.println("_____________");
        String st = "123456789";
        System.out.println(st);
        for (int i = st.length()-1; i >=0 ; i--) {
            System.out.print(st.charAt(i));
        }

    }
}

package Practice8;

public class StringWays {
    public static void main(String[] args) {
        String s1 = "Ratul";
        String s2 = new String("RaTul");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.contentEquals(s2));
        System.out.println("---------------------");
        StringBuffer sb = new StringBuffer("Ratul");
        System.out.println(sb);
        System.out.println(s1.contentEquals(sb));
        System.out.println(s1.equals(sb));
        //sb.append(s2);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }
}

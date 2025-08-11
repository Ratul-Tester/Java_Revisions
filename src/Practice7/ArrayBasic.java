package Practice7;

public class ArrayBasic {
    public static void main(String[] args) {
        String[] names = new String[3];
        int[] age = new int[3];

        names[0]="Ratul";
        names[1]="Nisha";
        names[2]="Rani";

        age[0]=38;
        age[1]=37;
        age[2]=9;

        int i;
        int j;

        for ( i = 0; i < names.length; i++) {
            System.out.println("The name is :"+names[i]);
        }
        for ( j = 0; j < age.length; j++) {
            System.out.println("And the age is :"+age[j]);
        }
    }
}

package Practice7;

public class BasicArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(nums.length);
        System.out.print(nums[4]);
        System.out.print(" "+nums[3]);
        System.out.print(" "+nums[2]);
        System.out.print(" "+nums[1]);
        System.out.print(" "+nums[0]+"\n");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        String[] names = {"Isqu","Visk","Pyar","Vyar"};
        System.out.print(names[3]);
        System.out.print(" "+names[2]);
        System.out.print(" "+names[1]);
        System.out.print(" "+names[0]+"\n");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        int[] ages = new int[5];
        ages[0] = 1;
        ages[1] = 2;
        ages[2] = 3;
        ages[3] = 4;
        ages[4] = 5;
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i]+" ");
        }
        System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        String[] allNames = new String[4];
        allNames[0]="Hare";
        allNames[1]="Krishna";
        allNames[2]="Hare";
        allNames[3]="Ram";
        for (int i = 0; i < allNames.length; i++) {
            System.out.print(allNames[i]+" ");
        }
        System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");


    }
}

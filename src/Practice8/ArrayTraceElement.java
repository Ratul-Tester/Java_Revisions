package Practice8;

public class ArrayTraceElement {
    public static void main(String[] args) {
        int[] num = {2,4,5,1};
        int target = 2;
        boolean find = false;

        for (int i = 0; i < num.length ; i++) {
            if (num[i]==target){
                find = true;
                break;
            }

        }
        if (find){
            System.out.println(target+" is found in the array list");
        } else {
            System.out.println(target+" not found in the array list");
        }
    }
}

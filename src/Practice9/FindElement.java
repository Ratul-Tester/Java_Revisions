package Practice9;

public class FindElement {
    public static void main(String[] args) {
        int[][] nums = {{2,4,6},{3,5,7}};
        int find = 2;
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j]==find){
                    found = true;
                    break;
                }
            }
        }
        if (found){
            System.out.println(find+" found in the Array List");
        } else {
            System.out.println(find+" not found in the Array List");
        }
    }
}

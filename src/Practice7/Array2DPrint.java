package Practice7;

public class Array2DPrint {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{3,2,1}};
        System.out.print(nums[0][0]);
        System.out.print(" "+nums[0][1]);
        System.out.print(" "+nums[0][2]+"\n");
        System.out.print(nums[1][0]);
        System.out.print(" "+nums[1][1]);
        System.out.print(" "+nums[1][2]+"\n");
        int ArrayLength = nums.length;

        for (int i = 0; i < ArrayLength; i++) {
            for (int j = 0; j <= ArrayLength; j++) {
                System.out.print(nums[i][j]+" ");
            }
                System.out.println("\n");
        }
    }
}

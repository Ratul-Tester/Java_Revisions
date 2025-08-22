package Practice8;

public class Array2DMaxMin {
    public static void main(String[] args) {
        int[][] nums = {{4,-1,8,9},{2,5,7,6}};
        int max = nums[0][0];
        int min = nums[0][0];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] < min) {
                    min = nums[i][j];
                }
                if (nums[i][j] > max) {
                    max = nums[i][j];
                }
            }
        }

        // Print results
        System.out.println("Smallest number: " + min);
        System.out.println("Biggest number: " + max);
    }
}

package Practice9;

public class ArrayMaxValue {
    public static void main(String[] args) {
        int[][] nums = {{1,3,5},
                        {2,9,6},
                        {7,8,4}};
        int max = nums[0][0];
        int min = nums[0][0];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] > max){
                    max = nums[i][j];
                }
                if (nums[i][j] < min){
                    min = nums[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

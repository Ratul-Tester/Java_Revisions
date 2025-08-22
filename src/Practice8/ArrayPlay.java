package Practice8;

public class ArrayPlay {
    public static void main(String[] args) {
        int[][] nums = {{4,3,8,9},{2,5,7,6}};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i][j]>max){
                max = nums[i][j];
            }
            if (nums[i][j]<min){
                min = nums[i][j];
            }

            for (int j = 0; j < 2; j++) {
                if (nums[i][j]>max){
                    max = nums[i][j];
                }
                if (nums[i][j]<min){
                    min = nums[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

package Practice9;

public class ArrayMaxValue {
    public static void main(String[] args) {
        int[][] nums = {{1,3,5},
                        {2,9,6},
                        {7,8,4}};
        int max = Integer.MIN_VALUE;
        int biggest=0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j]>max){
                    biggest = nums[i][j];
                    break;
                }
            }
        }
        System.out.println(biggest);
    }
}

package Practice8;

public class Array4XMaxMin {
    public static void main(String[] args) {
        int[][] num = {{2,9,6},{8,-1,3},{4,7,5}};
        int max = num[0][0];
        int min = num[0][0];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j]>max){
                    max = num[i][j];
                }
                if (num[i][j]<min){
                    min = num[i][j];
                }
            }
        }
        System.out.println(max+" is the biggest number in the given array");
        System.out.println(min+" is the smallest number in the given array");
    }
}

package Practice8;

public class ArrayElementTrace {
    public static void main(String[] args) {
        int[][] arr = {{2,-1,6,5},{1,8,9,4}};
        int tar = -1;
        boolean find = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==tar){
                    find = true;
                    break;
                }
            }
        }
        if (find){
            System.out.println(tar+" is found in the Array Block");
        }else {
            System.out.println(tar+" not found in the Array Block");
        }
    }
}

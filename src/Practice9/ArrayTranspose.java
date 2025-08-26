package Practice9;

public class ArrayTranspose {
    public static void main(String[] args) {
        int[][] main = {{1,2,3},{4,5,6},{7,8,9}};
        int transpose;

        for (int i = main.length-1; i >= 0; i--) {
            for (int j = main[i].length-1; j >= 0; j--) {
                transpose = main[i][j];
                System.out.print(transpose);
            }
        }
    }
}

package Practice7;

public class Array4X4 {
    public static void main(String[] args) {
        int[][] block = {{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}};
        System.out.print(block[0][0]+" ");
        System.out.print(block[0][1]+" ");
        System.out.print(block[0][2]+" ");
        System.out.print(block[0][3]+"\n");

        System.out.print(block[1][0]+" ");
        System.out.print(block[1][1]+" ");
        System.out.print(block[1][2]+" ");
        System.out.print(block[1][3]+"\n");

        System.out.print(block[2][0]+" ");
        System.out.print(block[2][1]+" ");
        System.out.print(block[2][2]+" ");
        System.out.print(block[2][3]+"\n");

        System.out.print(block[3][0]+" ");
        System.out.print(block[3][1]+" ");
        System.out.print(block[3][2]+" ");
        System.out.print(block[3][3]+"\n");
        System.out.println("---------");


        for (int i = 0; i < block.length ; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(block[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}

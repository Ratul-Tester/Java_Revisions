package Practice7;

public class Array3DPrint {
    public static void main(String[] args) {
        int[][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.print(numbers[0][0]+" ");
        System.out.print(numbers[0][1]+" ");
        System.out.print(numbers[0][2]+"\n");

        System.out.print(numbers[1][0]+" ");
        System.out.print(numbers[1][1]+" ");
        System.out.print(numbers[1][2]+"\n");

        System.out.print(numbers[2][0]+" ");
        System.out.print(numbers[2][1]+" ");
        System.out.print(numbers[2][2]+"\n");

        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.print("\n");

        }

    }
}

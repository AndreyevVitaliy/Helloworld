public class MultiDimensional_Array {
    public static void main(String[] args) {
        int[][] matrix =   {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};

//        System.out.println(matrix[2][3]);
        String[][] matrix1 = new String[2][3];
        matrix1[0][1] = "привет";

        System.out.println(matrix1[0][1]);

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}

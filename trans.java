public class trans {
    public static void transpose(int matrix[][], int row, int col) {
        int[][] trans = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                trans[i][j] = matrix[j][i];
            }
        }
        // without using extra space

        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                int temp = matrix[i][j];
                matrix[j][i] = matrix[i][j];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        int row = matrix.length;
        int col = matrix[0].length;
        System.out.println("transpose of matrix  ");

        transpose(matrix, row, col);
        // System.out.println("rotated aaray ");
        // rotate(matrix, row, col);

    }

}

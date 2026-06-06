import java.util.Scanner;

public class multid {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int r = matrix.length, c = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}

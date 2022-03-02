import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, column;
        System.out.print("Row : ");
        row = scan.nextInt();
        System.out.print("Column: ");
        column = scan.nextInt();

        int[][] matrix = new int[row][column];
        int[][] transpose = new int[column][row];

        // new matrix
        System.out.println("Enter array elements :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        // print matrix
        System.out.println("Matrix = ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // print transpose of matrix
        System.out.println("Transpose = ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                transpose[i][j] = matrix[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}

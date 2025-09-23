// WAP to check any input matrix is Magic or not
// (Magic: sum of all row and coloumn are same)

package programs;

import java.util.Scanner;

public class TwentyNine {

        public static boolean isMagic(int arr[][], int n) {
                int sum = 0;

                // Sum of first row (reference sum)
                for (int j = 0; j < n; j++) {
                        sum += arr[0][j];
                }

                // Check all row sums
                for (int i = 0; i < n; i++) {
                        int rowSum = 0;
                        for (int j = 0; j < n; j++) {
                                rowSum += arr[i][j];
                        }
                        if (rowSum != sum)
                                return false;
                }

                // Check all column sums
                for (int j = 0; j < n; j++) {
                        int colSum = 0;
                        for (int i = 0; i < n; i++) {
                                colSum += arr[i][j];
                        }
                        if (colSum != sum)
                                return false;
                }

                // Optional: check diagonals (for strict magic square)
                int diag1 = 0, diag2 = 0;
                for (int i = 0; i < n; i++) {
                        diag1 += arr[i][i];
                        diag2 += arr[i][n - i - 1];
                }
                if (diag1 != sum || diag2 != sum)
                        return false;

                return true;
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter number of rows: ");
                int rows = sc.nextInt();
                System.out.print("Enter number of columns: ");
                int cols = sc.nextInt();

                if (rows != cols) {
                        System.out.println("Matrix should be square matrix");
                        sc.close();
                        return;
                }

                int matrix[][] = new int[rows][cols];
                System.out.println("Enter matrix elements (by row) :");
                for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                                matrix[i][j] = sc.nextInt();
                        }
                }

                if (isMagic(matrix, rows))
                        System.out.println("It is a magic square.");
                else
                        System.out.println("It is not a magic square.");

                sc.close();
        }
}

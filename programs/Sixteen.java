// Input a 3X3 matrix ,Print the following -
// A) sum of the each row
// B) Sum of each column 
// C) sum of main diagonal 
// D) sum of the second diagonal 
// E) Transpose form.

package programs;

import java.util.Scanner;

public class Sixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter elements of 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nSum of each row:");
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + " = " + rowSum);
        }

        System.out.println("\nSum of each column:");
        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + " = " + colSum);
        }

        int mainDiagSum = 0;
        for (int i = 0; i < 3; i++) {
            mainDiagSum += matrix[i][i];
        }
        System.out.println("\nSum of main diagonal = " + mainDiagSum);

        int secDiagSum = 0;
        for (int i = 0; i < 3; i++) {
            secDiagSum += matrix[i][2 - i];
        }
        System.out.println("Sum of secondary diagonal = " + secDiagSum);

        System.out.println("\nTranspose of the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}


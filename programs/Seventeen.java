// Input two 3x3 matrix print the following : A) Addition of two matrix . B) Multiplication of two both.

package programs;

import java.util.Scanner;

public class Seventeen {
        public static void add(int a[][], int b[][]) {
                int sum[][] = new int[3][3];
                System.out.println("Sum of two matrices is:");
                for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                                sum[i][j] = a[i][j] + b[i][j];
                                System.out.print(sum[i][j] + " ");
                        }
                        System.out.println();
                }
        }

        public static void multiply(int a[][], int b[][]) {
                int product[][] = new int[3][3];
                for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                                for (int k = 0; k < 3; k++) {
                                        product[i][j] += a[i][k] * b[k][j];
                                }
                                System.out.print(product[i][j] + " ");
                        }
                        System.out.println();
                }
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int matrix1[][] = new int[3][3];
                System.out.println("Enter the elements of First 3 x 3 matrix: ");
                for (int i = 0; i < 3; i++)
                        for (int j = 0; j < 3; j++)
                                matrix1[i][j] = sc.nextInt();

                int matrix2[][] = new int[3][3];
                System.out.println("Enter the elements of Second 3 x 3 matrix: ");
                for (int i = 0; i < 3; i++)
                        for (int j = 0; j < 3; j++)
                                matrix2[i][j] = sc.nextInt();

                int ch = 0;
                do {
                        System.out.println(
                                        "Enter your choice:\n1- Addtion of two matrices\n2- Multiplication of two matrices\n3- Exit");
                        ch = sc.nextInt();
                        switch (ch) {
                                case 1:
                                        add(matrix1, matrix2);
                                        break;
                                case 2:
                                        multiply(matrix1, matrix2);
                                        break;
                                case 3:
                                        System.out.println("Exiting..");
                                        break;
                                default:
                                        System.out.println("Wrong choice , Choose again.");
                        }
                } while (ch != 3);
                sc.close();
        }
}

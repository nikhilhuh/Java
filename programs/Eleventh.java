// Program to print fibonacci series

package programs;

import java.util.Scanner;

public class Eleventh {

        public static void printFiboSeries(int n) {
                int a = 0, b = 1;
                System.out.print("Fibonacci series: ");
                for (int i = 1; i <= n; i++) {
                        System.out.print(a + " ");
                        int c = a + b;
                        a = b;
                        b = c;
                }
                System.out.println();
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the value of n: ");
                int n = sc.nextInt();
                if (n <= 0)
                        System.out.println("Enter a positive number");
                else
                        printFiboSeries(n);
                sc.close();
        }
}

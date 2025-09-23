// Sum of series -  1 + 1/2 + 1/3 + 1/4 + .... + 1/n

package programs;

import java.util.Scanner;

public class Ninth {

        public static void sumSeries(int n) {
                double sum = 0;
                for (int i = 1; i <= n; i++) {
                        sum += 1.0 / i;
                }

                System.out.println("Sum of series is: " + sum);
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number: ");
                int num = sc.nextInt();
                sumSeries(num);
                sc.close();
        }
}

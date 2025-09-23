// Input x and y calculate x ^ y without using library function.

package programs;

import java.util.Scanner;

public class First {

        public static double power(int x, int y) {
                if (y == 0)
                        return 1;

                double result = 1;
                int exp = Math.abs(y);
                int base = x;

                while (exp > 0) {
                        if (exp % 2 == 1) {
                                result *= base;
                        }

                        base *= base;
                        exp /= 2;
                }

                if (y < 0) {
                        result = 1.0 / result;
                }
                return result;
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the value of x: ");
                int x = sc.nextInt();
                System.out.print("Enter the value of y: ");
                int y = sc.nextInt();

                if (x == 0 && y == 0) {
                        System.out.println("0^0 is undefined");

                } else {
                        double result = power(x, y);
                        System.out.println(x + " ^ " + y + " = " + result);
                }

                sc.close();
        }
}
// Input a number print the reverse order of it.

package programs;

import java.util.Scanner;

public class Fourth {

        public static void reverse(int x) {
                int num = Math.abs(x), reverse = 0;
                while (num > 0) {
                        reverse = reverse * 10 + (num % 10);
                        num /= 10;
                }
                if (x < 0)
                        reverse = -reverse;
                System.out.println("Reverse of " + x + " is " + reverse);
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number: ");
                int num = sc.nextInt();
                reverse(num);
                sc.close();
        }
}

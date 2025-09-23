// Input starting and ending number print the table of each number

package programs;

import java.util.Scanner;

public class Seventh {

        public static void printTable(int n) {
                for (int i = 1; i <= 10; i++) {
                        System.out.println(n + " X " + i + " = " + n * i);
                }
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter starting number: ");
                int s = sc.nextInt();
                System.out.print("Enter ending number: ");
                int e = sc.nextInt();
                for (int i = s; i <= e; i++) {
                        printTable(i);
                        System.out.println();
                }
                sc.close();
        }
}

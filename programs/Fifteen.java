// Input a number print the equivalent binary number using an array.

package programs;

import java.util.Scanner;

public class Fifteen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Binary equivalent: 0");
            sc.close();
            return;
        }

        int[] binary = new int[32];
        int index = 0;

        int n = num;
        while (n > 0) {
            binary[index] = n % 2;
            n /= 2;
            index++;
        }

        System.out.print("Binary equivalent of " + num + " is: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        System.out.println();

        sc.close();
    }
}


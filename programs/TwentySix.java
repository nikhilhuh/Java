// WAP which accepts two strings from user and prints the alphabetically greater one

package programs;

import java.util.Scanner;

public class TwentySix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int result = str1.compareTo(str2);

        if (result == 0) {
            System.out.println("Both strings are equal.");
        } else if (result > 0) {
            System.out.println("Alphabetically greater string is: " + str1);
        } else {
            System.out.println("Alphabetically greater string is: " + str2);
        }

        sc.close();
    }
}


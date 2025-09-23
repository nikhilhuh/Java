// WAP to input any number,and write it in words

package programs;

import java.util.Scanner;

public class TwentySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        String[] words = { "Zero", "One", "Two", "Three", "Four",
                           "Five", "Six", "Seven", "Eight", "Nine" };

        String numStr = Integer.toString(num);

        System.out.print("In words: ");
        for (int i = 0; i < numStr.length(); i++) {
            char digit = numStr.charAt(i);
            System.out.print(words[digit - '0'] + " ");
        }
        System.out.println();

        sc.close();
    }
}


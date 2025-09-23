// WAP to input any range between two number, and find the tables of that ranges

package programs;

import java.util.Scanner;

public class Thirty {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        if(start > end){
            System.out.println("Starting number should be less than or equal to ending number.");
            sc.close();
            return;
        }

        // Loop through each number in the range
        for(int num = start; num <= end; num++){
            System.out.println("\nMultiplication table of " + num + ":");
            for(int i = 1; i <= 10; i++){
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }

        sc.close();
    }
}


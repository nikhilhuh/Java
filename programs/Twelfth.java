// WAP to show -  x + x^2/2! + x^3/3! + x^4/4! + .... + x^n/n!

package programs;

import java.util.Scanner;

public class Twelfth {

    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++)
            fact *= i;
        return fact;
    }

    public static void sumSeries(double x, int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x, i) / factorial(i);
        }
        System.out.println("Sum of series is: " + sum);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x = sc.nextDouble();
        System.out.print("Enter the number of terms n: ");
        int n = sc.nextInt();
        sumSeries(x, n);
        sc.close();
    }
}

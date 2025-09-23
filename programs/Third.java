// Input a number check whether it is prime or not.

package programs;

import java.util.Scanner;

public class Third {

        public static boolean isPrime(int x) {
                if (x < 2)
                        return false; // numbers less than 2 are not prime
                if (x == 2)
                        return true; // 2 is prime
                if (x % 2 == 0)
                        return false; // even numbers > 2 are not prime

                // Check odd divisors only up to sqrt(x)
                for (int i = 3; i * i <= x; i += 2) {
                        if (x % i == 0)
                                return false;
                }
                return true;
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number: ");
                int num = sc.nextInt();

                if (isPrime(num))
                        System.out.println(num + " is a Prime Number");
                else
                        System.out.println(num + " is not a Prime Number");

                sc.close();
        }
}

// Read Number from Console and Check if it is a Palindrome Number?

package programs;

import java.util.Scanner;

public class TwentyTwo {

        public static boolean isPalindrome(int n){
                int original = n, reverse = 0;
                while(n > 0){
                        reverse = (reverse * 10) + (n % 10);
                        n /= 10;
                }
                return original == reverse;
        }
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                if(isPalindrome(num))
                        System.out.println(num + " is a Palindrome Number.");
                else
                        System.out.println(num + " is not a Palindrome Number.");
                sc.close();
        }
}

// Input a number print the sum of its all digit.

package programs;

import java.util.Scanner;

public class Fifth {

        public static int sumDigits(int x){
                int sum = 0, num = Math.abs(x);
                while(num > 0){
                        sum += num % 10;
                        num /= 10;
                }

                return sum;
        }
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number: ");
                int num = sc.nextInt();
                int sum = sumDigits(num);
                System.out.println("Sum of digits: " + sum);
                sc.close();
        }
}

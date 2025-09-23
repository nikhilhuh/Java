// Input a number print whether it is armstrong or not.

package programs;

import java.util.Scanner;

public class Sixth {

        public static void isArmstrong(int x){
                int num = x, result = 0, n = 0;

                // number of digits
                while(num > 0){
                        n++;
                        num /= 10;
                }

                num = x;
                // calculating result
                while(num > 0){
                        result += Math.pow(num %10, n);
                        num /= 10;
                }

                if(result == x) System.out.println(x + " is an Armstrong Number");
                else System.out.println(x + " is not an Armstrong Number");
        }
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number: ");
                int num = sc.nextInt();
                isArmstrong(num);
                sc.close();
        }
}

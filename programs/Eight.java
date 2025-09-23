// Input a number print whether it is special or not.
// (Note: sum of all factorial of its digit is equal to original number. eg: 145

package programs;

import java.util.Scanner;

public class Eight {

        public static int factorialSum(int d){
                int fact = 1;
                for(int i = 1; i <= d; i++){
                        fact *= i;
                }
                return fact;
        }

        public static void isSpecial(int x){
                int num = x, sum = 0;
                while(num > 0){
                        sum += factorialSum(num % 10);
                        num /= 10;
                }

                if(sum == x) System.out.println(x + " is a special number");
                else System.out.println(x + " is not a special number");
        }
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number: ");
                int num = sc.nextInt();
                isSpecial(num);
                sc.close();
        }
        
}

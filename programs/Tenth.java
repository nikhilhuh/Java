// Sum of series -  1/2 + 2/3 + 3/4 + 4/5 + .... + n/n+1

package programs;

import java.util.Scanner;

public class Tenth {

        public static void sumSeries(int n){
                double sum = 0;
                for(double i=1 ;i <=n; i++){
                        sum += i /(i + 1);
                }

                System.out.println("Sum of series is: " + sum);
        }
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number: ");
                int num = sc.nextInt();
                sumSeries(num);
                sc.close();
        }
}

// Find Largest and Smallest Number in an Array using n elements?

package programs;

import java.util.Scanner;

public class TwentyOne {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number of elements: ");
                int n = sc.nextInt();

                int[] arr = new int[n];
                System.out.println("Enter the elements: ");
                for(int i=0;i<n;i++){
                        arr[i] = sc.nextInt();
                }

                int largest = arr[0], smallest = arr[0];
                for(int num: arr){
                        if(num > largest){
                                largest = num;
                        } else if(num < smallest){
                                smallest = num;
                        }
                }

                System.out.println("Largest number is: " + largest);
                System.out.println("Smallest number is: " + smallest);

                sc.close();
        }
}

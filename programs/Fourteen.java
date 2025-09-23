// Input 10 numbers in a array print the following :-
// a)Print the sum of all elements 
// b)Print the largest from array
// c)Reverse in a Array
// d)Input other search number find it is present or not.

package programs;

import java.util.Scanner;

public class Fourteen {

        public static void sum(int[] arr) {
                int sum = 0;
                for (int num : arr)
                        sum += num;
                System.out.println("Sum of all elements in the array is: " + sum);
        }

        public static void largest(int[] arr) {
                int largest = arr[0];
                for (int num : arr) {
                        if (num > largest)
                                largest = num;
                }
                System.out.println("Largest element in the array is: " + largest);
        }

        public static void reverse(int[] arr, int idx) {
                if (idx <= 0 || idx >= arr.length) {
                        System.out.println("The position should be within 1 and 10");
                        return;
                }
                int element = arr[idx - 1];
                int result = 0;
                int sign = element < 0 ? -1 : 1;
                element = Math.abs(element);
                while (element > 0) {
                        result = result * 10 + (element % 10);
                        element /= 10;
                }
                result *= sign;
                System.out.println("The reverse of element at " + idx + " is " + result);
        }

        public static void presence(int[] arr, int n) {
                boolean present = false;
                for (int num : arr) {
                        if (num == n) {
                                present = true;
                                break;
                        }
                }
                if (present)
                        System.out.println(n + " is present in the array");
                else
                        System.out.println(n + " is not present in the array");
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter 10 numbers in the array: ");
                int[] arr = new int[10];
                for (int i = 0; i < 10; i++)
                        arr[i] = sc.nextInt();
                int ch;
                do {
                        System.out.println(
                                        "Enter your choice:\n1- Sum of elements in array\n2- Largest number in array\n3- Reverse of a number at postion\n4- Presence of an element\n5- Exit");
                        ch = sc.nextInt();

                        switch (ch) {
                                case 1:
                                        sum(arr);
                                        break;
                                case 2:
                                        largest(arr);
                                        break;
                                case 3:
                                        System.out.print(
                                                        "Enter the position of the number to be reversed in the array: ");
                                        int idx = sc.nextInt();
                                        reverse(arr, idx);
                                        break;
                                case 4:
                                        System.out.print("Enter the element to be found in the array: ");
                                        int element = sc.nextInt();
                                        presence(arr, element);
                                        break;
                                case 5:
                                        System.out.println("Exiting...");
                                        break;
                                default:
                                        System.out.println("Wrong choice, Choose again");
                        }
                } while (ch != 5);

                sc.close();
        }
}

package arrays;

import java.util.Arrays;

public class AdvancedArrays {
    public static void main(String[] args) {
        // 1. Declaring and Initializing Arrays
        int[] arr1 = {5, 2, 9, 1, 7}; // array literal
        int[] arr2 = new int[5]; // default values -> 0

        // 2. Accessing & Updating
        arr2[0] = 10;
        arr2[1] = 20;
        System.out.println("arr2[0] = " + arr2[0]);

        // 3. Iterating using normal loop
        System.out.print("arr1 elements: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // 4. Enhanced for loop (for-each)
        System.out.print("arr2 elements: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 5. Using Arrays utility class
        Arrays.sort(arr1); // sorting
        System.out.println("Sorted arr1: " + Arrays.toString(arr1));

        int index = Arrays.binarySearch(arr1, 7); // searching
        System.out.println("Index of 7 in arr1: " + index);

        // 6. Copying arrays
        int[] copy1 = arr1.clone();
        int[] copy2 = new int[arr1.length];
        System.arraycopy(arr1, 0, copy2, 0, arr1.length);
        System.out.println("Copied arr1: " + Arrays.toString(copy1));

        // 7. Multi-dimensional array
        int[][] arr2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("2D Array (deepToString): " + Arrays.deepToString(arr2D));

        // 8. Jagged array
        int[][] jagged = new int[3][];
        jagged[0] = new int[]{1, 2};
        jagged[1] = new int[]{3, 4, 5};
        jagged[2] = new int[]{6, 7, 8, 9};
        System.out.println("Jagged Array: " + Arrays.deepToString(jagged));

        // 9. Passing array to method
        System.out.print("Array from method: ");
        printArray(arr1);

        // 10. Returning array from method
        int[] newArr = getArray();
        System.out.println("Returned Array: " + Arrays.toString(newArr));

        // 11. Common Problems
        System.out.println("Max in arr1: " + findMax(arr1));
        System.out.println("Sum of arr1: " + sumArray(arr1));
        reverseArray(arr1);
        System.out.println("Reversed arr1: " + Arrays.toString(arr1));
    }

    // Method to print array
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Method returning array
    static int[] getArray() {
        return new int[]{100, 200, 300};
    }

    // Find maximum element
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    // Find sum of elements
    static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    // Reverse array in-place
    static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

package arrays;

public class Arrays {
        public static void main(String[] args){
                // declaring array
                int[] arr1; // or int arr1[];

                // allocating memory to array
                arr1 = new int[5]; // static array
                arr1[0] = 1;
                arr1[1] = 2;
                arr1[2] = 3;
                arr1[3] = 4;
                arr1[4] = 5;
                // or arr1 = new int[]{1,2,3,4,5}; -> array literal
                // or int[] arr1 = {1,2,3,4,5};  -> initializing array

                // accessing array elements
                for(int i=0; i<arr1.length; i++) {
                        System.out.println("Element at index " + i + ": " + arr1[i]);
                }

                // updating array elements
                arr1[0] = 10;
                System.out.println("Updated element at index 0: " + arr1[0]);

                // multi-dimensional array
                int[][] arr2 = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };

                // accessing multi-dimensional array elements
                for(int i=0; i<arr2.length; i++){
                        for(int j=0; j<arr2[i].length; j++){
                                System.out.print(arr2[i][j] + " ");
                        }
                        System.out.println();
                }
        }
}

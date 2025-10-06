// Sort an integer array in ascending order . Input using command line arguments. 

package topicwiseprograms;

public class SortingArray {
        public static void main(String[] args) {
                if(args.length == 0) {
                        System.out.println("Please provide command line arguments");
                        return;
                }

                int[] arr = new int[args.length];
                for(int i = 0; i< args.length; i++) {
                        arr[i] = Integer.parseInt(args[i]);
                }

                // Sorting logic (Bubble Sort)
                for(int i=0; i< arr.length-1; i++) {
                        for(int j=0; j< arr.length-1-i; j++) {
                                if(arr[j] > arr[j+1]) {
                                        // swap
                                        int temp = arr[j];
                                        arr[j] = arr[j+1];
                                        arr[j+1] = temp;
                                }
                        }
                }

                for(int num: arr){
                        System.out.print(num + " ");
                }

        }
}

// Input ->
// java topicwiseprograms.SortingArray 1 4 2 5 3 6  7 23 12
// Output ->
// 1 2 3 4 5 6 7 12 23 

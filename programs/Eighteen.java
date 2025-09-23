// Pass ‘n’ numbers as command line arguments print the sum of all elements and print the largest no. from given ‘n’
// number.

package programs;

public class Eighteen {
        public static void main(String[] args){
                if(args.length == 0){
                        System.out.println("Please provide some numbers as command line arguments.");
                        return;
                }
                
                int sum = 0, largest = Integer.MIN_VALUE;
                for(String num: args){
                        int n = Integer.parseInt(num);
                        sum += n;
                        if(n > largest){
                                largest = n;
                        }
                }

                System.out.println("Sum of all elements: " + sum);
                System.out.println("Largest number in the given elements is: " + largest);
        }
}

// Pass ‘n’ number as command line arguments then print the all alternative numbers.
// Ex.: one two three 5 a b c 10 
// output: one three a c

package programs;

public class Ninteen {
        public static void main(String[] args){
                if(args.length == 0){
                        System.out.println("Please provide some input as command line arguments.");
                        return;
                }
                
                for(int i=0;i<=args.length-1;i=i+2)
                        System.out.print(args[i] + " ");
        }
}

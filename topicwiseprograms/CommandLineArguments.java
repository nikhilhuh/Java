// Sum of numbers using args[].

package topicwiseprograms;

public class CommandLineArguments {
        public static void main(String[] args) {
                if(args.length == 0) {
                        System.out.println("Please provide arguments to sum");
                        return;
                } 

                int sum = 0;
                for(String num: args){
                        sum += Integer.parseInt(num);
                }
                System.out.println("Sum: " + sum);
        }
}

// Input ->
// java topicwiseprograms.CommandLineArguments 1 2 3 4 5 6 7 8 9 10
// Output ->
// Sum: 55
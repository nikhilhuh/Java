// Input any name i.e RAJA RAM MOHAN ROY ,WAP TO Display R R M R ?

package programs;

import java.util.Scanner;

public class TwentyThree {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter any name: ");
                String name = sc.nextLine().trim().toUpperCase();

                String[] parts = name.split(" ");
                StringBuilder initials = new StringBuilder();
                for(String part: parts){
                        initials.append(part.charAt(0) + " ");
                }
                System.out.println(initials);
                sc.close();
        }
}

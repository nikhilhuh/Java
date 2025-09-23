// WAP to input any string and convert it into reverse form
// Input: this is my book
// Output: book my is this

package programs;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TwentyEight {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String str = sc.nextLine().trim();

                StringTokenizer st = new StringTokenizer(str, " ",true);
                StringBuilder sb = new StringBuilder("");
                while(st.hasMoreTokens()){
                        sb.insert(0, st.nextToken());
                }

                System.out.println(sb.toString());
                sc.close();
        }
}

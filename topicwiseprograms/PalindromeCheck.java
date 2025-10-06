package topicwiseprograms;

import java.util.Scanner;

public class PalindromeCheck {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String str = sc.nextLine();

                StringBuilder reversedStr = new StringBuilder("");
                for(int i = str.length() - 1; i>= 0; i--) {
                        reversedStr.append(str.charAt(i));
                }

                if(str.equals(reversedStr.toString())) System.out.println("The string is a palindrome.");
                else System.out.println("The string is not a palindrome.");

                sc.close();
        }
}

// Output ->
// Enter a string: Hello
// The string is not a palindrome.
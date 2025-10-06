// Count vowels & consonants in a string.

package topicwiseprograms;

import java.util.Scanner;

public class StringManipulation {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String str = sc.nextLine().trim().toLowerCase();
                int vowels = 0, consonants = 0;

                for(int i = 0; i<str.length(); i++) {
                        char ch = str.charAt(i);
                        if(ch >= 'a' && ch <= 'z'){
                                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                                        vowels++;
                                } else {
                                        consonants++;
                                }
                        }
                }

                System.out.println("Vowels: " + vowels);
                System.out.println("Consonants: " + consonants);
                sc.close();
        }
}

// Output ->
// Enter a string: Hi this is counting vowels and consonants.
// Vowels: 12
// Consonants: 23
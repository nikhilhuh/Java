// Input marks of three subjects calculate the total,percentage and grade as per following condition.
// Per>=80 ‘A’
// Per>=60 below 80 ‘B’
// Per>=40 below 60 ‘C’
// And below 40 ‘D’


package programs;

import java.util.Scanner;

public class Second {
        public static char grade(double m1, double m2, double m3){
                char g;
                double total = m1 + m2 + m3;
                double percentage = total / 3;

                if(percentage >= 80) g = 'A';
                else if(percentage >= 60) g = 'B';
                else if(percentage >= 40) g = 'C';
                else g = 'D';

                return g;
        } 
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter marks of first subject: ");
                double m1 = sc.nextDouble();
                System.out.print("Enter marks of second subject: ");
                double m2 = sc.nextDouble();
                System.out.print("Enter marks of third subject: ");
                double m3 = sc.nextDouble();

                char result = grade(m1, m2, m3);
                System.out.println("Grade is : " + result);

                sc.close();
        }
}

// Create a class student which is having the following data members and member methods:
// marks1, marks2, marks3 and getdata(), calculate result(), show result()

package programs;

import java.util.Scanner;

class Student {
        int marks1,marks2,marks3;

        void getData(int m1, int m2, int m3){
                marks1 = m1;
                marks2 = m2;
                marks3 = m3;
        }

        double calculateResult(){
                return (marks1 + marks2 + marks3)/3.0;
        }

        void showResult(){
                System.out.printf("Your result is: %.2f\n" , calculateResult());
        }
}

public class Twenty {
        public static void main(String[] args){
                Student student = new Student();
                int m1,m2,m3;

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the marks of three subjects: ");
                m1 = sc.nextInt();
                m2 = sc.nextInt();
                m3 = sc.nextInt();
                student.getData(m1,m2,m3);
                student.showResult();
                sc.close();
        }
}


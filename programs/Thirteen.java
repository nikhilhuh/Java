package programs;

import java.util.Scanner;

public class Thirteen {

        public static void pattern1(int n) {
                if(n <= 0) return;
                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++)
                                System.out.print(j);
                        System.out.println();
                }
        }

        public static void pattern2(int n) {
                if(n <= 0) return;
                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++)
                                System.out.print(i);
                        System.out.println();
                }
        }

        public static void pattern3(int n) {
                if(n <= 0) return;
                for (int i = 1; i <= n; i++) {  
                int a = 0, b = 1;
                        for(int j = 1;j <= i; j++){
                                System.out.print(a);
                                int c = a + b;
                                a = b;
                                b = c;
                        }
                        System.out.println();
                }
        }

        public static void pattern4(int n) {
                if(n <= 0) return;
                int a = 1;
                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++)
                                System.out.print(a++);
                        System.out.println();
                }
        }

        public static void pattern5(int n) {
                if(n <= 0) return;
                for (int i = 1; i <= n; i++) {
                        for(int j = 1; j <= n - i; j++) 
                                System.out.print(" ");
                        for (int j = 1; j <= i; j++)
                                System.out.print(j);
                        System.out.println();
                }
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int ch, n = 0;
                do {
                        System.out.println(
                                        "Enter your choice:\n1- Pattern 1\n2- Pattern 2\n3- Pattern 3\n4- Pattern 4\n5- Pattern 5\n6- Exit");
                        ch = sc.nextInt();

                        switch (ch) {
                                case 1:
                                        System.out.print("Enter number of lines: ");
                                        n = sc.nextInt();
                                        pattern1(n);
                                        break;
                                case 2:
                                        System.out.print("Enter number of lines: ");
                                        n = sc.nextInt();
                                        pattern2(n);
                                        break;
                                case 3:
                                        System.out.print("Enter number of lines: ");
                                        n = sc.nextInt();
                                        pattern3(n);
                                        break;
                                case 4:
                                        System.out.print("Enter number of lines: ");
                                        n = sc.nextInt();
                                        pattern4(n);
                                        break;
                                case 5:
                                        System.out.print("Enter number of lines: ");
                                        n = sc.nextInt();
                                        pattern5(n);
                                        break;
                                case 6:
                                        System.out.println("Exiting...");
                                        break;
                                default:
                                        System.out.println("Wrong choice, Choose again");
                        }
                } while (ch != 6);
                sc.close();
        }
}

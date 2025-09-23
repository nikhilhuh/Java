// CREATE package named complex ,to show the sum , product and subtraction of two complex number ,and import it
// into another program.

package programs;
import java.util.Scanner;
import programs.complex.Complex;

public class TwentyFour {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real and imaginary part of first complex number: ");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();

        System.out.print("Enter real and imaginary part of second complex number: ");
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        System.out.println("First Complex Number: " + c1);
        System.out.println("Second Complex Number: " + c2);

        System.out.println("Sum: " + c1.add(c2));
        System.out.println("Difference: " + c1.subtract(c2));
        System.out.println("Product: " + c1.multiply(c2));

        sc.close();
    }
}

// CREATE package named complex ,to show the sum , product and subtraction of two complex number ,and import it
// into another program.

package programs.complex;

public class Complex {
    private double real;
    private double imag;

    // Constructor
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Addition
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    // Subtraction
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    // Multiplication
    public Complex multiply(Complex other) {
        double r = this.real * other.real - this.imag * other.imag;
        double i = this.real * other.imag + this.imag * other.real;
        return new Complex(r, i);
    }

    // String representation
    public String toString() {
        if (imag >= 0) {
            return real + " + " + imag + "i";
        } else {
            return real + " - " + (-imag) + "i";
        }
    }
}

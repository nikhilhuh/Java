// Divide two numbers, handle divide-by-zero & input mismatch.

package topicwiseprograms;

public class ExceptionHandlingExample {
        public static void main(String[] args) {
                int a = 10, b =0;
                try {
                        int result = a / b;
                        System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                        System.out.println("Error: Division by zero is not allowed.");
                } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                } finally {
                        System.out.println("Execution completed.");
                }
        }
}

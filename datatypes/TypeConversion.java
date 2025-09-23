package datatypes;

public class TypeConversion {
        public static void main(String[] args){
                // Implicit Conversion (Widening)
                int intValue = 100;
                double doubleValue = intValue; // int to double
                System.out.println("Implicit Conversion: " + doubleValue);

                // Explicit Conversion (Narrowing)
                double anotherDoubleValue = 9.78;
                int anotherIntValue = (int) anotherDoubleValue; // double to int
                System.out.println("Explicit Conversion: " + anotherIntValue);

                // String to int conversion
                String strValue = "123";
                int strToInt = Integer.parseInt(strValue);
                System.out.println("String to int Conversion: " + strToInt);

                // int to String conversion
                int numValue = 456;
                String intToStr = Integer.toString(numValue);
                System.out.println("int to String Conversion: " + intToStr);
        }
}

package datatypes;

public class DataTypes {
        public static void main(String[] args){

                // Primitive data types
                byte myByteNum = 5; // 8 bits
                short myShortNum = 5; // 16 bits
                int myIntNum = 5; // 32 bits
                long myLongNum = 5; // 64 bits
                float myFloatNum = 5; // 32 bits
                double myDoubleNum = 5; // 64 bits
                System.out.println("Byte: " + myByteNum);
                System.out.println("Short: " + myShortNum);
                System.out.println("Int: " + myIntNum);
                System.out.println("Long: " + myLongNum);
                System.out.println("Float: " + myFloatNum);
                System.out.println("Double: " + myDoubleNum);

                char myChar = 'A'; // 16 bits
                char myUnicodeChar = '\u0041'; // Unicode for 'A'
                char myAsciiChar = 65; // ASCII value for 'A'
                System.out.println("Char: " + myChar);
                System.out.println("Unicode Char: " + myUnicodeChar);
                System.out.println("ASCIIChar: " + myAsciiChar);

                boolean mybool = true; // 1 bit
                System.out.println("Boolean: " + mybool);

                // Non-primitive data types
                String myString = "Hello, World!"; 
                System.out.println("String: " + myString);

                int arr[] = new int[]{1,2,3,4,5};
                System.out.print("Array: ");
                for(int i: arr){
                        System.out.print(i + " ");
                }
        }
}

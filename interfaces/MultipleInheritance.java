package interfaces;

interface Add {
        int add(int a, int b);
}

interface Sub { 
        int sub(int a, int b);
}
class Cal implements Add, Sub {

        public int add(int a, int b){
                return a+b;
        }
        
        public int sub(int a , int b){
                return a-b;
        }
}

public class MultipleInheritance {
        public static void main(String[] args){
                Cal obj = new Cal();

                System.out.println("Addition: " + obj.add(1,2));
                System.out.println("Subtraction: " + obj.sub(2,1));
        }
}

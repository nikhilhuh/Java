// Write a Java program to create an interface Vehicle with methods start() and stop(), 
// and implement it in Car and Bike classes.

package topicwiseprograms;

interface Vehicle {
        void start();
        void stop();
}

class Car implements Vehicle {
        @Override
        public void start() {
                System.out.println("Car started");
        }

        @Override
        public void stop() {
                System.out.println("Car stopped");
        }
}

class Bike implements Vehicle {
        @Override
        public void start() {
                System.out.println("Bike started");
        }

        @Override
        public void stop() {
                System.out.println("Bike stopped");
        }
}

public class Interface {
        public static void main(String[] args){
                Car car = new Car();
                Bike bike = new Bike();

                car.start();
                bike.start();
                car.stop();
                bike.stop();
        } 
}

// Output ->
// Car started
// Bike started
// Car stopped
// Bike stopped
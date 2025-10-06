// Abstract class Shape with method area(), implement Circle & Rectangle.

package topicwiseprograms;

abstract class Shape {
        abstract double area();
}

class Circle extends Shape {
        double radius, pi;

        Circle(double radius) {
                this.radius = radius;
                this.pi = 3.14;
        }

        @Override
        double area() {
                return pi * radius * radius;
        }
}

class Rectangle extends Shape {
        double width, height;

        Rectangle(double width, double height) {
                this.width = width;
                this.height = height;
        }

        @Override
        double area() {
                return width * height;
        }
}

public class AbstractionExample {
        public static void main(String[] args) {
                Circle circle = new Circle(100);
                Rectangle rectangle = new Rectangle(100, 50);
                System.out.println("Area of Circle with radius 100: " + circle.area());
                System.out.println("Area of Rectangle with width 100 and height 50: " + rectangle.area());
        }
}

// Output ->
// Area of Circle with radius 100: 31400.0
// Area of Rectangle with width 100 and height 50: 5000.0
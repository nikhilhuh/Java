// Animal (parent) & Dog (child), demonstrate method overriding.

package topicwiseprograms;

class Animal {
        void sound() {
                System.out.println("Animal makes a sound");
        }
}

class Dog extends Animal {
        @Override
        void sound() {
                System.out.println("Dog barks");
        }
}

public class InheritanceExample {
        public static void main(String[] args) {
                Dog dog = new Dog();
                dog.sound();
        }
}

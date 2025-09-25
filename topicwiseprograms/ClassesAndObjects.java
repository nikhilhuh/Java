// Create Student class with name, roll, marks and display details.

package topicwiseprograms;

class Student {
        String name;
        int roll;
        double marks;

        Student(String name, int roll, double marks) {
                this.name = name;
                this.roll = roll;
                this.marks = marks;
        }
        
        void displayDetails() {
                System.out.println("Name: " + name);
                System.out.println("Roll: " + roll);
                System.out.println("Marks: " + marks);
        }
}
public class ClassesAndObjects {
        public static void main(String[] args){
                Student student1 = new Student("Nikhil", 86, 85);
                student1.displayDetails();
                Student student2 = new Student("Nitesh", 92, 81);
                student2.displayDetails();
        }
}
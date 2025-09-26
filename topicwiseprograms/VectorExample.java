// Store integers and display contents.

package topicwiseprograms;

import java.util.Vector;

public class VectorExample {
        public static void main(String[] args) {
                Vector<Integer> v = new Vector<>(5,5);

                v.insertElementAt(1,0);
                v.insertElementAt(2,1);
                v.addElement(3);
                v.addElement(4);
                v.addElement(5);

                for(int num: v)
                        System.out.println(num);

                System.out.println("Size: " + v.size());
                System.out.println("Capacity: " + v.capacity());

                v.addElement(6);
                System.out.println("Size: " + v.size());
                System.out.println("Capacity: " + v.capacity());

                v.removeElement(6);
                System.out.println("Size: " + v.size());
                System.out.println("Capacity: " + v.capacity());
        }
}

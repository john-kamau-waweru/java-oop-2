package lists;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a new vector
        Vector<Integer> v = new Vector<Integer>();

        // add elements to the vector
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);

        // insert element at index 1
        v.insertElementAt(6, 1);

        for (int x : v) {
            System.out.println(x);
        }
    }
}

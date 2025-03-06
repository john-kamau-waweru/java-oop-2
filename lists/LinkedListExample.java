package lists;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        // Create a new LinkedList
        LinkedList<String> ll = new LinkedList<String>();

        // Add elements
        ll.add("apple");
        ll.add("orange");
        ll.add("pineapple");

        ll.add(1, "cherry");

        System.out.println("Initial LinkedLits" + ll);

        ll.set(1, "banana");
        ll.remove("pineapple");

        System.out.println("Updated LinkedList" + ll);

        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }

    }
}

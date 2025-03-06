package lists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        int n = 5;

        List<Integer> ll = new LinkedList<Integer>();

        for (int i = 1; i <= n; i++) {
            ll.add(i);
        }

        System.out.println("Linked List: " + ll);

        ll.remove(1);

        System.out.println("Updated Linked List: " + ll);
    }
}

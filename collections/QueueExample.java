package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // create a queue listing using LinkedList
        Queue<String> q = new LinkedList<>();

        // use add method to insert elements - throws exception if insertion fails
        q.add("element1");
        q.add("element2");
        q.add("element3");

        // use offer method to insert elements - returns false if insertion fails
        q.offer("element4");

        // Display the queue
        System.out.println("Queue " + q);

        // peek at the first element (doesn't remove it)
        String firstElement = q.peek();
        System.out.println("Peek " + firstElement);

        // poll the first element (retrieve and removes it)
        String polledElement = q.poll();
        System.out.println("Poll " + polledElement);

        System.out.println("Queue after poll: " + q);
    }
}

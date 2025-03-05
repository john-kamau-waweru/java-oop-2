package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // create a set
        Set<String> set = new HashSet<>();

        set.add("apple");
        set.add("banana");
        set.add("cherry");

        // remove element
        set.remove("banana");

        // check if a set contains an element
        boolean containsApple = set.contains("apple");
        System.out.println("Contains apple: " + containsApple);

        // size of set
        int size = set.size();
        System.out.println("Size of set is: " + size);
    }
}

package collections;
// HashMap implements the Map interface which is part of the Java Collection Framework

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // create a hashmap
        Map<String, Integer> map = new HashMap<>();

        // Insert values
        map.put("apple", 1);
        map.put("banana", 2);

        // get
        Integer value = map.get("apple"); // returns 1

    }
}

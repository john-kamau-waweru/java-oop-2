package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        // create a new HashMap
        Map<String, Integer> map = new HashMap<>();

        // put(K key, V value) - Inserts key-value pairs into the map
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        // get(Object key) - returns the value associated with the key
        Integer value = map.get("banana");
        System.out.println("Value for banana: " + value);

        // remove(Object key) - removes the key-value pair for the specified key
        map.remove("cherry");

        // containsKey(Object key) - checks if the map contains the specified key
        boolean hasApple = map.containsKey("apple");
        System.out.println("Contains 'apple' " + hasApple);

        // keySet() - returns a set of view of the keys contained in the map
        Set<String> keys = map.keySet();
        System.out.println("Keys in map: " + keys);
    }
}

package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // create a List
        List<String> list = new ArrayList<>();

        // add(E element)
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // get(int index)
        String secondElement = list.get(1); // Banana

        // set(int index, E element)
        list.set(1, "Blueberry");

        // remove(int index)
        list.remove(0);

        // size()
        int size = list.size();

        // print the list
        System.out.println(list);

        // print the size
        System.out.println(size);
    }
}
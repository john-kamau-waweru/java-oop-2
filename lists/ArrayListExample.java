package lists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> stringAL = new ArrayList<String>();

        // adding elements to list
        stringAL.add("apple");
        stringAL.add("banana");
        stringAL.add("cherry");
        stringAL.add("apple");

        System.out.println("Initial List" + stringAL);

        // updating
        stringAL.set(2, "water melon");

        System.out.println("Updated List" + stringAL);

        int i = stringAL.indexOf("apple");

        System.out.println("First occurence of apple is at index: " + i);

        int l = stringAL.lastIndexOf("apple");

        System.out.println("Last occurence of apple is at index: " + l);

        // remove items
        stringAL.add("pineapple");
        stringAL.add("berry");

        System.out.println("All fruits before removing: " + stringAL);

        stringAL.remove(1);

        stringAL.remove("berry");

        System.out.println("All fruits after removing at index 1 and the berry: " + stringAL);
    }
}

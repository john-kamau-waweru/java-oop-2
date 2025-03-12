package sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<String>();

        hs.add("B");
        hs.add("B");
        hs.add("A");
        hs.add("A");
        hs.add("C");

        System.out.println(hs);
    }
}

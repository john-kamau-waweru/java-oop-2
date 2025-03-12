package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<Integer>();

        a.addAll(Arrays.asList(new Integer[] { 1, 3, 5, 8, 2, 9, 0, 8, 7, 6 }));

        Set<Integer> b = new HashSet<Integer>();

        b.addAll(Arrays.asList(new Integer[] { 2, 8, 3, 9, 0, 1, 2, 5 }));

        // to find union
        Set<Integer> union = new HashSet<Integer>(a);

        union.addAll(b);

        System.out.println("Union on the two sets");

        System.out.println(union);

        // Symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);

        difference.removeAll(b);

        System.out.println("Difference: " + difference);
    }
}

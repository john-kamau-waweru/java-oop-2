package lists;

import java.util.List;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        int n = 5;

        List<Integer> s = new Stack<Integer>();

        for (int i = 1; i <= n; i++) {
            s.add(i);
        }

        System.out.println("Stack " + s);

        s.remove(2);

        System.out.println("Updated Stack: " + s);

    }
}

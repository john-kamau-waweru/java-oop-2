package lists;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();

        s.push("apple");
        s.push("banana");
        s.push("avocado");

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

        System.out.println(s);

    }
}

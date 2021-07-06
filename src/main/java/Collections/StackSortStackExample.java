package Collections;

import java.util.Collections;
import java.util.Stack;

public class StackSortStackExample {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(300);
        stack.add(500);
        stack.add(200);
        System.out.println(stack.peek());
        Collections.sort(stack);
        System.out.println("after sorting see the peek value");
        System.out.println(stack.peek());
    }
}

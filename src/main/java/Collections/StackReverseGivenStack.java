package Collections;

import java.util.Stack;

// wap to reverse a stack
public class StackReverseGivenStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(300);
        stack.add(500);
        stack.add(700);
        System.out.println(stack.peek());

        System.out.println("----------------");
        Stack<Integer> stack1 = new Stack<>();

        for(int i = stack.size()-1; i>=0; i--){
            stack1.add(stack.get(i));
        }
        stack1.forEach(k-> System.out.println(k));

        System.out.println("--------------");
        System.out.println(stack1.peek());
    }
}

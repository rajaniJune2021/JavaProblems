package Collections;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;


// wap to reverse a queue

public class QueueReverseQueue {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(300);
        queue.add(500);
        queue.add(700);
        queue.add(800);
        System.out.println("size of the queue is:"+queue.size());

       // System.out.println(queue.peek());
        System.out.println("--------------");

        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.add(queue.peek());
            queue.remove();
        }
        while(!stack.isEmpty()){
            queue.add(stack.peek());
            stack.pop();
        }

        queue.forEach(k -> System.out.println(k));
    }
}

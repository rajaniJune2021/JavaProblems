package Collections;

//wap to sort a queue

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class QueueSortGivenQueue {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(900);
        deque.add(800);
        deque.add(500);
        deque.add(200);
        Object[] obj = deque.stream().toArray();
        Deque<Integer> deque1 = new ArrayDeque<>();
        for(int i= obj.length-1; i>=0;i--){
            deque1.add((Integer) obj[i]);
        }
        deque1.forEach(k-> System.out.println(k));

    }
}

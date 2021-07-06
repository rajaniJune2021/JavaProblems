package Collections;

// wap to reverse the arraylist.

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistReverseGivenLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);
        Collections.reverse(linkedList);

        Iterator<Integer> iterator = linkedList.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

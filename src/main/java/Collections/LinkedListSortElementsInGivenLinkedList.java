package Collections;

// wap to sort the elements of the arraylist.

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSortElementsInGivenLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(300);
        linkedList.add(200);
        linkedList.add(700);
        linkedList.add(400);

        Collections.sort(linkedList);
        Iterator<Integer> iterator = linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

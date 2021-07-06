package Collections;

// wap to compare two arraylist and print the common elements.

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListPrintCommonElementsInGivenLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(600);
        Collections.sort(linkedList);

        LinkedList<Integer> linkedList1 = new LinkedList();
        linkedList1.add(200);
        linkedList1.add(500);
        linkedList1.add(600);
        Collections.sort(linkedList1);
        for(Integer k: linkedList){
           if(linkedList1.contains(k)){
               System.out.println(k);
           }
        }

    }
}

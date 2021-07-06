package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

// wap to remove duplicates elements from the Linkedlist.
public class LinkedListRemoveDuplicateelementsInGivenLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(20);
        linkedList.add(500);
        linkedList.add(600);
        linkedList.add(500);
      //  linkedList.remove(2);
        Collections.sort(linkedList);
       for(int i=0;i<linkedList.size();i++){
           for(int j=i+1;j<linkedList.size();j++){
               if(linkedList.get(i).equals(linkedList.get(j))){
                  linkedList.remove(linkedList.get(j));
               }
           }
       }
        Iterator<Integer> iterator = linkedList.iterator();
       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }

    }

}

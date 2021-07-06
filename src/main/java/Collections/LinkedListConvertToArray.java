package Collections;

// wap convert arraylist into array.

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListConvertToArray {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(500);
        linkedList.add(600);

         Object[] num = new Object[linkedList.size()];
          num = linkedList.stream().toArray();
         for (int i=0; i<num.length;i++){
             System.out.println(num[i]);
         }
    }
}

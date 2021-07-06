package Collections;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

// Given linkedList every pair have swap it I/P: [1,2,3,4] O/P: [2,1,4,3]
public class CollectionProgramSix {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        for(int i=0; i<=linkedList.size()/2; i=i+2){
            Integer temp = linkedList.get(i);
            Integer temp2 = linkedList.get(i+1);
            linkedList.set(i,temp2);
            linkedList.set(i+1,temp);
        }

        System.out.println(linkedList);

    }
}

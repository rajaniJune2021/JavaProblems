package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// wap to reverse the arraylist.
public class ArrayListReverseTheGivenArrayList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(200);
        list.add(7);
        list.add(800);
        List<Integer> list1 = new ArrayList<>();
        for (int i= list.size()-1;i>=0;i--){
            list1.add(list.get(i));
        }

        Iterator iterator = list1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

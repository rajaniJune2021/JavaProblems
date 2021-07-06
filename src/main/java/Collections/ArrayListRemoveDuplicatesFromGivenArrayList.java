package Collections;

// wap to remove duplicates elements from the arraylist.

import java.util.*;

public class ArrayListRemoveDuplicatesFromGivenArrayList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(200);
        list.add(2); // store the duplicates and insertion order.


        for(int i=0;i<list.size();i++){
            for(int j=i+1; j<list.size();j++){
                if(list.get(i) == list.get(j)){
                    System.out.println(list.remove(i));
                }
            }
        }

        Set<Integer> s = new LinkedHashSet<Integer>(list);
        System.out.println(s);

        System.out.println("------------------------");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

}

package Collections;

// wap to sort the elements of the arraylist.

import java.util.*;

public class ArrayListSortTheGivenList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(200);
        list.add(7);
        list.add(800);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}

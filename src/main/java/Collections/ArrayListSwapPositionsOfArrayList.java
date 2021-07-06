package Collections;

// wap to swap two elements of an arraylist.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSwapPositionsOfArrayList {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(300);
        list.add(400);
        list.add(700);
        int temp1, temp2;
        Collections.swap(list,1,2);
        System.out.println(list);
    }

}

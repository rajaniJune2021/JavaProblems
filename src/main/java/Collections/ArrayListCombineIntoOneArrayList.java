package Collections;

// wap to combine two arraylist into single arraylist.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListCombineIntoOneArrayList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(200);
        list.add(7);
        list.add(800);

        List<Integer> list1 = new ArrayList<>();
        list.add(200);
        list.add(700);
        list.add(113);

        List<Integer> combineTwoList = new ArrayList<>();

        for (int i=0; i<list.size();i++){
            combineTwoList.add(list.get(i));
        }
        for(int j=0;j<list1.size();j++){
            combineTwoList.add(list1.get(j));
        }
        for (int k: combineTwoList){
            System.out.println(k);
        }

        System.out.println("--------------------");
        Collections.sort(combineTwoList);
        for (int m: combineTwoList){
            System.out.println(m);
        }
    }
}

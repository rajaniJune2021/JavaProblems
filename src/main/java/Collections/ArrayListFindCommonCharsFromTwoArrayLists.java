package Collections;

// wap to compare two arraylist and print the common elements.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListFindCommonCharsFromTwoArrayLists {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(200);
        list.add(7);
        list.add(800);
      Collections.sort(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(800);
        list1.add(8);
        list1.add(7);
        list1.add(9);
        Collections.sort(list1);
        for(Integer i:list){
            if(list1.contains(i)){
                System.out.println(i);
            }
        }

//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < list1.size(); j++) {
//                try {
//                    if (list.get(i) == list1.get(j)) {
//                        System.out.println(list1.get(j));
//                    }
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
//            }
//        }

//        for (int k : commonList) {
//            System.out.println(k);
//        }

    }
}

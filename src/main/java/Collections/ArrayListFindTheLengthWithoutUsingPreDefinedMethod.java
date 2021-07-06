package Collections;

// wap to find the size of the arraylist without using the pre-defined method.

import java.util.ArrayList;
import java.util.List;

public class ArrayListFindTheLengthWithoutUsingPreDefinedMethod {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(200);
        list.add(7);
        list.add(800);

        int count = 0;

//        try {
//            for (int i = 0; i >= 0; i++) {
//                list.get(i);
//                count++;
//            }
//        } catch (Exception e) {
//            System.out.println(count);
//        }
        for(Integer i:list){
            count++;
        }
        System.out.println("size of the list is:"+count);
    }
}

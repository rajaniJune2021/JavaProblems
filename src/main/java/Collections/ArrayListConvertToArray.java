package Collections;

// wap convert arraylist into array.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConvertToArray {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(200);
        list.add(7);
        list.add(800);
      int[] k = new int[list.size()];

      for (int m =0;m<list.size();m++){
          k[m] = list.get(m);
      }

      for (int n : k){
          System.out.println(n);
      }

    }
}

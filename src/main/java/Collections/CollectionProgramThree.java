package Collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

// wap program convert binary number to octal number : octal number - 8421 : binary 1001
public class CollectionProgramThree {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        map.put(8,1);
        map.put(4,1);
        map.put(2,1);
        map.put(1,1);
       Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
       
        int[] value = {1,0,0,1};
        int result = 0; int counter =0;
        for(int i=0; i<value.length;i++){
         Integer k =   value[i];
            if(k ==1){
//                for(Map.Entry<Integer,Integer> m: map.entrySet())   {
                    Integer v = map.get(i);
                    result = result + v;
               // }
            }else {
                result = result +0;
            }
        }

        System.out.println(result);
    }
}

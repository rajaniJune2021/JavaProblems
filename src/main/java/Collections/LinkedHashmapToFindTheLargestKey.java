package Collections;


import java.util.LinkedHashMap;
import java.util.Map;

//wap to find the largest key in the hashmap
public class LinkedHashmapToFindTheLargestKey {

    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(100,"school");
        map.put(20,"college");
        map.put(300,"office");
        map.put(125,"sports");
        int largestNumber =0;

        for(Map.Entry<Integer,String> m: map.entrySet()){
            Integer integer = m.getKey();
           if(integer>largestNumber){
              largestNumber = integer;
           }
        }

        System.out.println(largestNumber);
    }
}

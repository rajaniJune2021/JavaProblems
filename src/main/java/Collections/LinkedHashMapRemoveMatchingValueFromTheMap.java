package Collections;

import java.util.*;

public class LinkedHashMapRemoveMatchingValueFromTheMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(100, "school");
        map.put(20, "college");
        map.put(300, "office");
        map.put(125, "sports");

//        Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
//        while(iterator.hasNext()){
//            Map.Entry<Integer,String> temp = iterator.next();
//            if("school".equals(temp.getValue())){
//                iterator.remove();
//            }
//        }

        //solving the problem with lamda expression
        map.entrySet().removeIf(entry -> ("school").equals(entry.getValue()));
        map.remove(20);
        System.out.println(map);
    }
}

package Collections;

import java.util.*;

//wap to sort the map based on the values
public class LinkedHashMapSortTheMapBasedOnTheValues {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "school");
        map.put(20, "college");
        map.put(300, "office");
        map.put(125, "sports");

        List<Integer> keyList = new ArrayList<>(map.keySet());
        List<String> valuesList = new ArrayList<>(map.values());
        Collections.sort(keyList);
        Collections.sort(valuesList);

       Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
       Iterator<String> it = valuesList.iterator();
       while(it.hasNext()){
           String temp = it.next();
           Iterator<Integer> keyIterator = keyList.iterator();
           while(keyIterator.hasNext()){
               Integer i = keyIterator.next();
               String value = map.get(i);
               if(value.equals(temp)){
                   keyIterator.remove();
                   linkedHashMap.put(i,value);
               }
           }
       }
        System.out.println(linkedHashMap);

    }
}
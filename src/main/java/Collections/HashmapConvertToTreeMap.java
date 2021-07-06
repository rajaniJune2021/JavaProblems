package Collections;
import java.util.*;


// Convert a hashmap into tree map

public class HashmapConvertToTreeMap {

    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("school",120);
        hashMap.put("college",130);
        hashMap.put("sports",140);
        hashMap.put("office", 170);

        Map<String, Integer> treeMap = new TreeMap<>();

        treeMap.putAll(hashMap);

        for(Map.Entry<String,Integer> m: hashMap.entrySet()){
            System.out.print(m.getKey() +":");
            System.out.println(m.getValue());
        }
    }
}

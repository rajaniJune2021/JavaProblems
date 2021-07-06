package Collections;

import java.util.HashMap;
import java.util.Map;

//wap to merge two hashmaps
public class HashMapMergeTwohashMaps {

    public static void main(String[] args) {

        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("C",100);
        hashMap.put("Java",200);
        hashMap.put("ruby",300);

        Map<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Java",400);
        hashMap1.put("cypress",500);
        hashMap1.put("RestAssured",700);

        hashMap.putAll(hashMap1);

        System.out.println(hashMap);


    }
}

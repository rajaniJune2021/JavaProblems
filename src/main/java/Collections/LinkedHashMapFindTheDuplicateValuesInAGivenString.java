package Collections;

// wap to print only the duplicate characters in a string- ex input - java and output is  {a: 2}

import java.util.*;

public class LinkedHashMapFindTheDuplicateValuesInAGivenString {

    public static void main(String[] args) {
        String s = "Rajani";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for(Map.Entry<Character,Integer> m: map.entrySet()){
            if(m.getValue()>1){
                System.out.println(m.getKey()+":" +m.getValue());
            }
        }

    }

}

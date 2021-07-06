package Collections;


// wap to count occurances of each character it repeated Ex: input Java (J:1; a:2; v:1)

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapRepeatedCharInAGivenString {

    public static void main(String[] args) {
        String s1 = "Java is a programming language";
        String s = s1.toLowerCase().trim();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            System.out.print(m.getKey() + ":");
            System.out.println(m.getValue());
        }

    }

}

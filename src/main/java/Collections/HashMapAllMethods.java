package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

// All hash map methods
public class HashMapAllMethods {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "csharp");
        map.put(3, "ruby");
        map.put(4, "python");
        map.put(5, "javascript");

        //one hash map to another hashmap
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(7, "cypress");
        HashMap h = (HashMap) map1.clone();
        System.out.println(map.containsKey(1));

        //initial capacity of hashmap = 16
        map.remove(2);
        System.out.println(map);
        System.out.println("------------------");
        map.remove(3, "ruby");
        System.out.println(map);

        map.replace(1, "selenium");

        System.out.println(map);
        System.out.println("------------------");

        map.replace(5, "javascript", "cypress");

        System.out.println(map);
        String[] s = {"cricket", "badminton", "football", "chess", "ruby"};

        System.out.println("-------------------");

        for (int j = 0; j < s.length; j++) {
            String temp = s[j];
            map.replaceAll((key,val) -> (val == null) ? "":temp);

        }

        System.out.println(map);
        System.out.println("------------------");

        System.out.println(map);
        map.put(6,null);
        map.putIfAbsent(6, "kotlin");
        System.out.println(map);
        System.out.println("------------------");
        System.out.println(map.isEmpty());
        System.out.println("-----------------");
        map.getOrDefault(1,"defaultString");
        System.out.println(map);
        System.out.println("----------------");
        map.put(7,"test");
        String q= map.get(7);
        map.merge(7, q,(key,val) -> val.concat("updatedValue"));
        System.out.println("------------");
        System.out.println(map);
        int hashCode=  map.hashCode();
        System.out.println("--------------");
        System.out.println(hashCode);
        System.out.println("---------------");

    }
}

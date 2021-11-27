package Collections;


// wap to check strings are anagram or not  by using hashMaps ex: listen and silent

import java.util.*;

public class HashMapCheckGivenStringISAnagramOrNot {
    public static void main(String[] args) {

        String s = "listen";
        String s1 = "silents";
        char[] c = s.toCharArray();
        char[] c1 = s1.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map1 = new HashMap<>();
        if (c.length-1 == c1.length-1) {
            for (int i = 0; i < c.length; i++) {
                if (map.get(c[i]) == null) {
                    map.put(c[i], 1);
                } else {
                    map.put(c[i], map.get(c[i]) + 1);
                }
            }
            for (int i = 0; i < c1.length; i++) {
                if (map1.get(c1[i]) == null) {
                    map1.put(c1[i], 1);
                } else {
                    map1.put(c1[i], map.get(c1[i]) + 1);
                }
            }
            if (map.equals(map1)) {
                System.out.println("given string is anagram");
            }
        } else {
            System.out.println("given two string lengths are different");
        }
    }
}


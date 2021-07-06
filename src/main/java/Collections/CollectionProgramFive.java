package Collections;

import java.security.Key;
import java.util.*;

// Given a list of strings ["eat","ate","silent","listen","word"] find pairs of anagrams and put them in a map eat - ate here eat will become key and ate will be value in map ; for word there is no anagarm word will be key and value will be null
public class CollectionProgramFive {
  static  Map<String, String> map = new HashMap<>();

    public static void main(String[] args) {
        String[] a = {"eat", "ate", "silent", "listen", "word"};

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                map = isAnagramOrNot(a[i], a[j]);
            }
        }
        System.out.println(map);

    }


    public static Map<String, String> isAnagramOrNot(String a, String b) {
        boolean isAnagramPairOrNot = false;
        int aSize = a.length() - 1;
        int bSize = b.length() - 1;
        char[] c = a.toCharArray();
        char[] c1 = b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        if (aSize == bSize) {
            if (Arrays.equals(c,c1)) {
                isAnagramPairOrNot = true;
            }
            if (isAnagramPairOrNot) {
                map.put(a, b);
            }
        }
        if(b== ""){
            map.put(a,null);
        }
        return map;
    }
}

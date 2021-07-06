import java.util.*;

public class StringCommonCharsinGiventwoStrings {

    public static void main(String[] args) {
        String s = "rajani";
        String s1 = "naresh";

        char[] schar = s.toCharArray();
        Arrays.sort(schar);

        char[] s1char = s1.toCharArray();
//        Arrays.sort(s1char);
//        Set<Character> list = new HashSet<>();
//
//        for (int i = 0; i < schar.length; i++) {
//            for (int j = 0; j < s1char.length; j++) {
//                if (schar[i] == s1char[j]) {
//                    list.add(schar[i]);
//                }
//            }
//        }
//
//        System.out.println(list);
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < schar.length; i++) {
            int value1 = schar[i];
                for (int j = 0; j < s1char.length; j++) {
                    int value2 = s1char[j];
                    if (value1 == value2) {
                        map.put(schar[i],1);
                    }
                }
            }
        System.out.println(map.keySet());

    }
}

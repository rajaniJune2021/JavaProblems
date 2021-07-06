package Collections;

import java.util.HashMap;
import java.util.Map;

//
// Take a larger number (123456123789123) - Take a larger number (123456123789123) -To print how many times this 123 repeated in the given String : output should be (123: 3times repeated)

public class HashMapRepeatedNumbersInAGivenString {

    public static void main(String[] args) {
        String s = "123456123789123";
        HashMap<String, Integer> hashMap = new HashMap<>();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            try {
                if ((i + 3) <= s.length()) {
                    Integer integer = hashMap.get(s.substring(i, i + 3));
                    if (integer != null) {
                        count++;
                    }
                    hashMap.put(s.substring(i, i + 3), count);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(hashMap.get("123"));
    }
}

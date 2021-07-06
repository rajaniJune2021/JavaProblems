package Collections;

import java.util.HashMap;
import java.util.Map;

// Input abdderdddddyuddpd  - how many 'dd' word repeated in a given string
public class HashMapRepeatedWordInGivenString {
    public static void main(String[] args) {
        String s = "abdderdddddyuddpd";

        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            if ((i + 2) < s.length()) {
                String pairString = s.substring(i, i + 2);
                if (pairString.equals("dd"))
                    count++;
            }
        }
        System.out.println(count);

    }
}

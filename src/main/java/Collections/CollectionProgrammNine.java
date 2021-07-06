package Collections;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// String problem: input is 3[a]2[bc] output : aaabcbc another input : 3[a2[c]] output: accaccacc
public class CollectionProgrammNine {

    static Map<String, String> map = new LinkedHashMap<>();

    public static void main(String[] args) {

        String numeric = "[0-9]+";
        String s = "3[a2[c]]";
        getSubStrings(s);
        String result = "";
        for (Map.Entry<String, String> m : map.entrySet()) {
            String s1 = m.getValue();
            String s2 = m.getKey();
            int value = Integer.parseInt(s2);
            result =  result+ getLengthOfString(s1,value);


        }

        System.out.println(result);
    }

    public static void getSubStrings(String s) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i);
            if (isDigit(value)) {
                stack2.add(String.valueOf(s.charAt(i)));
                System.out.println(stack2.peek());
            }

            if (s.charAt(i) == '[') {
                stack1.add(i);
            } else if (s.charAt(i) == ']' && !stack1.isEmpty() ){
                int pos = stack1.peek();
                stack1.pop();

                int subsLength = i - 1 - pos;

                String subString = s.substring(pos + 1, pos + 1 + subsLength);
                map.put(stack2.peek(), subString);
                stack2.pop();
            }

        }

        System.out.println(map);
    }

    public static boolean isDigit(int k) {
        boolean isDigit = false;
        if (k >= 48 && k <= 57) {
            isDigit = true;
        }
        return isDigit;
    }

    public static String getLengthOfString(String h, int count){
        String result ="";
        for(int i=0; i<count;i++){
            result = result+h;
        }
        return result;
    }

}

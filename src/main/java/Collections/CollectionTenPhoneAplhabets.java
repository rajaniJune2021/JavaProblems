package Collections;

import java.util.*;

// enter keypad - 23(a,b,c) 3-(d,e,f) - ad,ae,af,bd,be,be,cd,ce,cf- this program should work with 2-9 number
public class CollectionTenPhoneAplhabets {
    static Map<Integer, String> map = new LinkedHashMap<>();
    static List<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        String endString = "";
        int score = 0;
        System.out.println("enter number here");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc = new Scanner(line);

        score = sc.nextInt();
//            splitViaModulo(score);
//            for(int k= list.size()-1; k>=0; k-- ){
//            endString = endString + resultString(list.get(k));}
        // endString = endString + resultString(score);
        endString = endString + resultString(score);

        System.out.println(endString);
    }

    public static String resultString(int value) {
        String result = "";
        int count = 0;
        Integer listCounter = null;
        String temp;
        char[] c3 = new char[list.size()];
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        splitViaModulo(value);
//        for (int k = list.size() - 1; k >= 0; k--) {
//            Integer listNum = list.get(k);
//            if (listCounter == listNum ) {
//                count++;
//            }else{
//            listCounter = listNum;
//            count =0;}
//
//            if (count <= 0) {
//                if (map.containsKey(listNum)) {
//                    temp = map.get(listNum);
//                    char[] c = temp.toCharArray();
//                    count++;
//                    result = result + c[count - 1];
//                }
//            } else {
//                temp = map.get(listNum);
//                char[] c = temp.toCharArray();
//                result = result.replace(result.charAt(result.length() - 1), c[count - 1]);
//            }
//        }
        for (int r = 0; r < list.size(); r++) {
            if (map.containsKey(list.get(r))) {
                String s = map.get(list.get(r));
           int q = getTheCountOfCharArrayInMap(list.get(r));
//                c3 = s.toCharArray();
//                Integer listNum = list.get(r);

            }

            if (count > 0) {
                result = result + c3[count];
            } else {
                for (int j = 0; j < c3.length; j++) {
                    result = result + c3[j];
                }
            }
        }

        return result;
    }

    public static List<Integer> splitViaModulo(long number) {
        while (number > 0) {
            int digit = (int) (number % 10);
            list.add(digit);
            number /= 10;
        }
        return list;
    }


    public static int getTheCountOfCharArrayInMap(int i) {
        char[] c;
        String t = map.get(i);
        c = t.toCharArray();
       int count = c.length-1;
       return count;
    }
}

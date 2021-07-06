package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapConvertRomanNumbersIntoIntergers {

    public static void main(String[] args) {

        System.out.println("Please enter roman number");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        int result =0;
       for(int i=0;i<s.length();i++){
           if(i>0 && map.get(s.charAt(i)) >map.get(s.charAt(i-1))){
               result = result+(map.get(s.charAt(i))-2*map.get(s.charAt(i-1)));
           }else {
               result = result+map.get(s.charAt(i));
           }
       }

        System.out.println(result);

    }
}

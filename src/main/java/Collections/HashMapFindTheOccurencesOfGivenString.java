package Collections;

import java.util.HashMap;
import java.util.Map;

// wap find the occurences of a word in a given String using hashmap
public class HashMapFindTheOccurencesOfGivenString {

    public static void main(String[] args) {

        String s ="Java Is A Programming Java Language";
        String[] words = s.split(" ");
        int count=1;
        Map<String,Integer> map = new HashMap<>();

        for(String word:words){
            Integer integer = map.get(word);
            if(integer == null){
                map.put(word,1);
            }else{
                map.put(word,integer+1);
            }
        }
        System.out.println("value for non existing key:"+map.get("rajani"));
        for (Map.Entry m: map.entrySet()){
            System.out.print(m.getKey()+": ");
            System.out.println(m.getValue());
        }


    }


}

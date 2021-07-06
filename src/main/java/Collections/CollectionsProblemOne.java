package Collections;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// wap to find if a number is panagram or not if it contains (0-9) ex: 1234567890 ; 12 - this is not panagram
public class CollectionsProblemOne {

    public static void main(String[] args) {
        String s ="1234567890";

       Set<Integer> set = new HashSet<>();
       for (int i=0; i<s.length();i++){
           set.add((int) s.charAt(i));
       }

       if(set.size() == 10){
           System.out.println("The given value is panagram");
       }

    }


}

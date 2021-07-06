package Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// wap to compare two hashsets. if the values are identical in two hashsets or not
public class HashSetCompareTwoHashsets {

    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("testing");
        hs.add("automation");
        hs.add("project");

        Set<String> hs1 = new HashSet<>();
        hs1.add("automation");
        hs1.add("automation");
        hs1.add("project");

        boolean b= false;

        if(hs.containsAll(hs1)){
            b = true;
        }

        System.out.println(b);
        System.out.println("-----------");
        hs.forEach(k -> System.out.println(k));

    }
}

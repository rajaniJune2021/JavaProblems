package Collections;


import java.util.HashSet;
import java.util.Set;

// wap compare two hashsets and print only common elements
public class HashSetCompareTwoHashsetToPrintCommonElements {

    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        hs.add("testing");
        hs.add("automation");
        hs.add("project");

        Set<String> hs1 = new HashSet<>();
        hs1.add("java");
        hs1.add("automation");
        hs1.add("project");

        hs.retainAll(hs1);

        hs.forEach(s-> System.out.println(s));

    }
}

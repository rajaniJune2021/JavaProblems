package Collections;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//clone a hashset into another hashset.

public class HashSetCloneTwoHashsetIntoOne {

    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("testing");
        hs.add("automation");
        hs.add("project");

        Set<String> hs1 = new HashSet<>();
        hs1.add("Java");
        hs1.add("is");
        hs1.add("programming");
        hs1.add("language");

        hs.addAll(hs1);
        hs.forEach(k-> System.out.println(k));
    }
}

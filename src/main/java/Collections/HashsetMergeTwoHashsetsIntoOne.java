package Collections;
import java.util.HashSet;
import java.util.Set;

// wap to merge two hashsets into one hashset.

public class HashsetMergeTwoHashsetsIntoOne {

    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);

        Set<Integer> hs1 = new HashSet<>();
        hs1.add(50);
        hs1.add(70);
        hs1.add(80);
        hs.addAll(hs1);
        hs.forEach(k-> System.out.println(k));
    }
}

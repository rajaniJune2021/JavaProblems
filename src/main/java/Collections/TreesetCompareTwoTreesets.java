package Collections;

import java.util.Set;
import java.util.TreeSet;

// wap compare two hashsets and print only common elements
public class TreesetCompareTwoTreesets {

    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("testing");
        treeSet.add("automation");
        treeSet.add("project");

        Set<String> treeSet1 = new TreeSet<>();
        treeSet1.add("testing");
        treeSet.add("programming");

        treeSet.retainAll(treeSet1);
        treeSet.forEach(s-> System.out.println(s));
    }
}

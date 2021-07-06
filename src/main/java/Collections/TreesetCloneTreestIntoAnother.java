package Collections;

import java.util.Set;
import java.util.TreeSet;

//clone a hashset into another hashset.
public class TreesetCloneTreestIntoAnother {

    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("testing");
        treeSet.add("automation");
        treeSet.add("project");

        Set<String> treeSet1 = new TreeSet<>();
        treeSet1.add("java");
        treeSet.add("programming");

        treeSet.addAll(treeSet1);
        treeSet.forEach(s-> System.out.println(s));
    }
}

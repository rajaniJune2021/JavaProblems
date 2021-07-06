package Collections;


import java.util.LinkedHashSet;

//clone a hashset into another hashset.
public class LinkedHashSetCloneIntoAnotherLinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("testing");
        linkedHashSet.add("automation");
        linkedHashSet.add("project");

        LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>();
        linkedHashSet1.add("java");
        linkedHashSet1.add("is");
        linkedHashSet1.add("a");
        linkedHashSet1.add("programming");
        linkedHashSet1.add("language");

        linkedHashSet.addAll(linkedHashSet1);

        linkedHashSet.forEach(s-> System.out.println(s));
    }
}

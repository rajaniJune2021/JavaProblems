package Collections;

import java.util.LinkedHashSet;

// wap compare two hashsets and print only common elements

public class LinkedHashSetCompareTwoLinkedHashSetToGetCommonElements {

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
        linkedHashSet1.add("testing");

        linkedHashSet.retainAll(linkedHashSet1);
        linkedHashSet.forEach(s-> System.out.println(s));

    }

}

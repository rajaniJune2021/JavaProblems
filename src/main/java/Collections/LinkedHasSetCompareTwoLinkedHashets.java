package Collections;

import java.util.LinkedHashSet;

public class LinkedHasSetCompareTwoLinkedHashets {
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

        boolean b;

        if(linkedHashSet.containsAll(linkedHashSet1)){
            b = true;
        }else{
            b= false;
        }

        System.out.println(b);
    }
}

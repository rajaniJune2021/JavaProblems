package Collections;

// wap to create a subList from the arrayList.

import java.util.ArrayList;

public class ArrayListPrintSubListFromGivenArrayList {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("java");
        arrayList.add("is");
        arrayList.add("a");
        arrayList.add("programming");
        arrayList.add("language");

        for(int i=0; i<arrayList.size();i++){
            for(int j=i; j<arrayList.size();j++) {
                for (int k = i; k <= j; k++) {
                    System.out.println(arrayList.get(k));
                }
                System.out.println();
            }

        }
   }
}

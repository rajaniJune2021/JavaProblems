package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Take a collection of words frame a sentence from all given words (Java, is , a, programming, language") - frame a sentence
public class CollectionProgramTwo {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Java");
        list.add("is");
        list.add("a");
        list.add("programming");
        list.add("language");

        String result ="";
        for(int i=0; i< list.size(); i++){
            result = result+list.get(i)+" ";
        }
        System.out.println(result);

    }
}

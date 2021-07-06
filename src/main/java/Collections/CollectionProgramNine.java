package Collections;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// String problem: input is 3[a]2[bc] output : aaabcbc another input : 3[a2[c]] output: accaccacc
public class CollectionProgramNine {

    public static void main(String[] args) {

        String s = " 3[a2[c]]";
        System.out.println(s);


    }

//    public static void structureThePattern(String input){
//        String regex = "(?<=\\[)[A-Za-z]+(?=\\])";
//        Pattern p = Pattern.compile(regex);
//        Matcher m = p.matcher(input);
//
//        System.out.println(m);
//
//    }
}

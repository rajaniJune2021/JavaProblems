import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPrintenclosedWordWithSingleQuote {
    // WaP I/P: Java is a 'programming' language O/P: print the string enclosed in the single quotes output=programming
    public static void main(String[] args) {
        String input ="Java is a 'programming' language";
        String[] word = input.split(" ");
        String regex = ".*'([^']*)'.*";
        Pattern p = Pattern.compile(regex);
        Matcher m1 = p.matcher(input);
        if(m1.matches())
        System.out.println(m1.group(1));
//        for(int i=0;i<word.length;i++) {
//            if (word[i].contains("'")) {
//                System.out.println(word[i].replace("'",""));
//            }
//        }

    }
}

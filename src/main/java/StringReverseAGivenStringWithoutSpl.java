import java.util.Locale;

public class StringReverseAGivenStringWithoutSpl {

    public static void main(String[] args) {
        //   input String rajani_gunda ; output String = RajaniGunda

        String inputString ="rajani_gunda";
        String[] words = inputString.split("_");
        String result ="";

       for (int i=0; i<words.length;i++){

           String temp = String.valueOf(words[i].charAt(0)).toUpperCase() +  words[i].substring(1,words[i].length());
           result= result+temp;
       }

        System.out.println(result);


    }
}

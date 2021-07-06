import java.util.Arrays;

public class StringPrintTheWordsInAlphabeteicalOrder {
    // WIP arrange the words of given string in an alphabetical way - input-"Rajani does not speak much "  output = does much not Rajani speak

    public static void main(String[] args) {
        //String inputString = "Rajani does not speak much";
        String inputString = "abcde ab a abc";
        inputString = inputString.toLowerCase();
        String[] words = inputString.split(" ");
        Arrays.sort(words);
        String temp = "";
        String result = "";
        int value3 =0;

        for (int i = 0; i < 1; i++) {
            int value1 = words[i].charAt(0);
            temp = words[0];
            for (int j = i + 1; j < words.length; j++) {
                int value2 = words[j].charAt(0);
                if (value1 > value2) {
                    if (value3 < value2) {
                        result = result + words[j];
                        value3 = value2;
                    } else {
                        result = words[j] + result;
                    }
                } else {
                    temp = temp + " " + words[j];
                }
            }
        }
        result = (result + temp).trim();


        System.out.println(result);
    }
}

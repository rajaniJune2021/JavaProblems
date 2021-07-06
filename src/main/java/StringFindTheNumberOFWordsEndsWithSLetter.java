public class StringFindTheNumberOFWordsEndsWithSLetter {

    //wap to find the number of words ending with s in the given string - input: "miss rajani"; output :1

    public static void main(String[] args) {
        String input = "miss rajani";
        String[] words = input.split(" ");
        int count =0;
        for (int i = 0; i < words.length; i++) {
        String s1 =  String.valueOf(words[i].charAt(words[i].length()-1));
            if (s1.equalsIgnoreCase("s")) {
                count++;
                System.out.println(words[i]+ " "+ count);
            }
        }
    }
}

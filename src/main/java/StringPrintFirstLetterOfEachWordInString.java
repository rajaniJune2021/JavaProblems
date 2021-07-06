public class StringPrintFirstLetterOfEachWordInString {
    // wap to reverse the even words of given string -Java is a programming language - output string - output string - Jipl

    public static void main(String[] args) {
        String inputString = "Java is a programming language";
        String[] words =inputString.split(" ");
        String result = "";
        for(int i=0; i< words.length; i++){
            {

                System.out.println(words[i].charAt(0));
            }
        }

    }
}

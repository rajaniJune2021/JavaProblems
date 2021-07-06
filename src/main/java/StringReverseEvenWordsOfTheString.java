public class StringReverseEvenWordsOfTheString {

    public static void main(String[] args) {
        // wap to reverse the even words of given string -Java is a programming language  - output string - Jipl

        String inputString = "Java is a programming language";
        String[] words = inputString.split(" ");
        String reverse = "";
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                result = result + words[i] + " ";
            } else {
                for (int j = words[i].length() - 1; j >= 0; j--) {
                    reverse = reverse + words[i].charAt(j);
                }
                result = result + reverse + " ";
                reverse = "";
            }
        }

        System.out.println(result);
    }
}

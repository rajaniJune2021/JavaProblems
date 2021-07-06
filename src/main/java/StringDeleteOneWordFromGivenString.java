public class StringDeleteOneWordFromGivenString {
    public static void main(String[] args) {
        //input string- Java is a programming language output string -Java is a language
        String inputString = "Naresh is an Awesome trainer";


       inputString = inputString.replace("is ", "");
//        String words[] = inputString.split(" ");
//        String result = "";
//        for (int i = 0; i < words.length; i++) {
//
//            if (!words[i].contains("p")) {
//                result = result + words[i] + " ";
//            } else {
//                result = result + "";
//            }
//        }
        System.out.println(inputString);
    }
}

public class StringPrintMiddleCharOFGivenString {

    //wap to print the middle character in a string //I/o: books //o/p: o

    public static void main(String[] args) {

        String input = "booksd";
        char[] words = input.toCharArray();
        int length = (words.length-1);
        int middleCharIndex = length/2;

        if(input.length() %2 != 0){
            System.out.println(words[middleCharIndex]);
        }else{
            System.out.println(words[middleCharIndex+1]);
        }

    }
}

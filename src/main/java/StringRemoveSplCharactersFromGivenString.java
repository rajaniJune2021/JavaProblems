public class StringRemoveSplCharactersFromGivenString {

    // remove numbers and spl characters from a given string and print only the alphabets. input string is -abc123@#&

    public static void main(String[] args) {

        String inputString = "abc123@#&_%#";
        char[] inputArray = inputString.toCharArray();
        String result= "";

        for(int i=0; i<inputArray.length;i++){
          int value = inputString.charAt(i);
          if(value>=97 && value <= 122){
              result = result+inputArray[i];
          }
        }
        System.out.println(result);
    }
}

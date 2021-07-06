public class StringSwapPairOfCharsInGivenString {

    public static void main(String[] args) {
          String input = "books";
         char[] charArray =  input.toCharArray();
          String result ="";

         for(int i=0; i<charArray.length-1;i+=2){
               char temp = input.charAt(i);
                  charArray[i] = charArray[i+1];
                  charArray[i+1] = temp;
             }

        System.out.println(new String(charArray));
         }
    }


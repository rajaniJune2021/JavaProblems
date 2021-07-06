public class StringRemoveaCharInGivenInputString {

    //Write a program to remove a given character from String?
//You need to write a Java method that will accept a String and a character to be removed and return a String, which doesn't has that character e.g remove(String word, char ch).

    String result ="";

    public void removeAChar(String input, char c){

        for(int i=0;i<input.length();i++){
        input =  input.toLowerCase();
            int value = input.charAt(i);

            if(value == (c)){
                result = result+"";
            }else{
                result = result + input.charAt(i);
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {

        StringRemoveaCharInGivenInputString obj = new StringRemoveaCharInGivenInputString();
        obj.removeAChar("RajaniLearner",'r');
    }
}

public class StringRemovemultipleOccurencesOfWords {
    // WIP remove the multiple occurences of word in given string ="Rajani does not rajani much" -output - Rajani does not much
    public static void main(String[] args) {

        String inputString = "Rajani does not speak rajani rajani rajani much";
        String words[] = inputString.split(" ");
        String result="";
        String temp ="";

        for(int i=0; i<1;i++){
            temp = words[0];
            for(int j=1; j<words.length;j++){

                if(words[i].equalsIgnoreCase(words[j])){
                   result = result+"";
                }else{
                    result = result+words[j] +" ";
                }

            }
            result = temp +" "+ result;
        }
        System.out.println(result.trim());

    }
}

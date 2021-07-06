public class StringSwapFirstAndLastWordsOfGivenInput {

    // interchange the first and last words of the string -"Rajani does not speak much" output string -"much does not speak Rajani"
    public static void main(String[] args) {

        String inputString = "Rajani does not speak much";
        String words[] = inputString.split(" ");
        String result ="";
        String temp = words[0];
        String temp2 = words[words.length-1];

        for(int i=0;i< words.length;i++){
            if(i!=0 && i!= words.length-1){
                result = result+words[i]+" ";
            }
        }

        System.out.println(temp2+" "+result+temp);
    }
}

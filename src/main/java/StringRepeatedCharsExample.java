public class StringRepeatedCharsExample {

    public static void main(String[] args) {
        String inputString = "Rajani";
        char[] inputStringArray = inputString.toCharArray();
        int count =1;

        for (int i=0; i<inputString.length()-1;i++){
            for (int j=i+1; j<inputString.length()-1;j++){
                if(inputStringArray[i]== inputStringArray[j]){
                  count++;
                    System.out.println("This is most repeated character "+inputStringArray[i] +" " +count);
                }else{
                    System.out.println("");
                }
            }
        }

    }

}

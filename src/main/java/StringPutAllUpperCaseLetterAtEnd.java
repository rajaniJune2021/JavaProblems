public class StringPutAllUpperCaseLetterAtEnd {

    public static void main(String[] args) {
        String s = "RajaniGundaGunda"; //output = ajaniundaRG
        String temp = "";

        for(int i=0; i<s.length();i++){
            int value = s.charAt(i);
            if(value>=65 && value<=90){
                String j = String.valueOf(s.charAt(i));
                temp += s.charAt(i);
                s= s.replace(j,"");
            }
        }

        String result = s+temp;
        System.out.println(result);


    }

}

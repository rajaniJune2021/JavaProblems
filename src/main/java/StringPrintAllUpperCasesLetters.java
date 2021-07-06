public class StringPrintAllUpperCasesLetters {


    public static void main(String[] args) {
        String s = "Good Morning Friends";
        char[] c = s.toCharArray();
        int uppercaseCount =0;


        for(int i=0;i<c.length;i++){
            if(s.charAt(i)<65 && s.charAt(i)>90){
              uppercaseCount++;
              System.out.println("these are uppercase letter in given string "+ c[i]);
            }
        }


    }
}

public class StringFindAllPossiblePalindromeSubStringsInAGivenString {

    // Find all the possible palindromes substrings in a given string : intput: racecar output: aceca, cec etc..

    public static void main(String[] args) {

        String input = "racecar";
        StringFindAllPossiblePalindromeSubStringsInAGivenString obj = new StringFindAllPossiblePalindromeSubStringsInAGivenString();
        obj.findPossibleSubStrings(input);

    }

    public void findPossibleSubStrings(String input){
        for(int i=0; i<=input.length()-1;i++){
            for(int j=i+1; j<=input.length()-1;j++){
            String subString = input.substring(i,j+1);
              //  System.out.println(subString);
                if(checkPalindromeOrNot(subString)){
                    System.out.println("possible palindrome substring is:"+subString);
                }
            }
        }
    }

    public boolean checkPalindromeOrNot(String s){
        boolean b = false;
        String rev ="";
        char c[] = s.toCharArray();
        for(int i=c.length-1;i>=0;i--){
            rev = rev +c[i];
        }
        if(s.equals(rev)){
            b = true;
        }
        return b;
    }
}

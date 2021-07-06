import java.util.Arrays;
import java.util.Scanner;

public class StringAnagramProgram {

    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string of anagram");
        s= sc.next();
        String s1= "";
        System.out.println("Enter second string of anagram");
        s1= sc.next();
        char[] s1CharArray = s.toCharArray();
        Arrays.sort(s1CharArray);
        char[] s2CharArray = s1.toCharArray();
        Arrays.sort(s2CharArray);
        boolean b =false;
        if(s.length() == s1.length()){
           for(int i=0; i<s1CharArray.length;i++){
               if(s1CharArray[i] == s2CharArray[i]){
                   b = true;
               }else{
                   b = false;
               }
           }
        }

        if(b){ System.out.println("These given two strings are anagrams");}else{
            System.out.println("These given two strings are not anagrams");
        }
    }
}

import java.util.Arrays;

public class StringPanagram {

    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        boolean[] b = new boolean[26];
        boolean ispangarm = false;

        for(int i=0;i<s.length();i++){
            int j = s.charAt(i)-'A';
            b[j] = true;
        }

        for(int k=0;k<b.length;k++){
            if(b[k]){
                ispangarm= true;
            }else {
                ispangarm= false;
            }
        }
        if(ispangarm){
            System.out.println("The given input string is pangram");
        }else{
            System.out.println("The given input string is not pangram");
        }
    }
}

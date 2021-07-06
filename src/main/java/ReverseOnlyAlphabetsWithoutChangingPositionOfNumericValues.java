import java.util.HashMap;
import java.util.LinkedHashMap;

public class ReverseOnlyAlphabetsWithoutChangingPositionOfNumericValues {

    // Reverse only Alphabets without changing the numeric value position in a given string : input : a1b2c3 output: c1b2a3

    public static void main(String[] args) {
        String s = "A1B2C3";
        String result = "";
        String temp1 ="";
        String temp2="";

        char[] c = s.toCharArray();
        for(int i=c.length-1;i>=0;i--){
            int ascii = c[i];
            if(ascii>=65 && ascii<=90){
                temp1 = temp1+c[i];
            }else{
                temp2=temp2+c[i];
            }
        }
        char a[] = temp1.toCharArray();
        char b[] = temp2.toCharArray();
        int j=0;
        for(int i=b.length-1;i>=0;i--){
            result = result+a[j]+b[i];
            j++;
        }
        System.out.println("result is:"+result);

    }
}

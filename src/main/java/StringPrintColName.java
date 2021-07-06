import java.util.Scanner;

public class StringPrintColName {

//    ASCII value of the character (-) 'A'+1
//    inputString = 'D';
//     68-65+1 =4

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String colName =sc.next();
        int result = 0;
        for(int i=0; i<colName.length();i++ ){
            result = result *26;
            result = result + colName.charAt(i) -'A' +1;
        }
        System.out.println("Col Name with col value = " + colName + result);
    }
}

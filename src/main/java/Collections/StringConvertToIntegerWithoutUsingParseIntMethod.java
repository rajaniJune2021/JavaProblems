package Collections;

public class StringConvertToIntegerWithoutUsingParseIntMethod {


    public static void main(String[] args) {

        System.out.println(convertStringTOInteger("123")+10);
    }

    public static int convertStringTOInteger(String str){

        int sum =0;
        // 0 - ascii value is 48
        char[] c= str.toCharArray();
        for(int i=0;i<c.length;i++){
            int ascIIValue= c[i];
            sum = sum*10+ ascIIValue -48;
        }
        return sum;
    }


}

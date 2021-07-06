public class StringReversewWthSplCharacter {
    public static void main(String[] args) {
        String s = "RajaniGundaRajni"; //output should be rajani_gunda;

        String newString = "";
        char[] c = s.toCharArray();
        char temp;

        for (int i = 0; i < c.length; i++) {

            int value = c[i];
            if (i!=0 && value >=65 && value<=90) {
                temp = c[i];
                newString = newString+"_"+temp;
            }else{
                newString = newString + c[i];
            }
        }
        newString = newString.toLowerCase();

        System.out.println("out put String is " + newString);

    }
}

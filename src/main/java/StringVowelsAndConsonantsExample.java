import java.sql.SQLOutput;

public class StringVowelsAndConsonantsExample {

    public static void main(String[] args) {

        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int vowelCount = 0;
        int consonantsCount = 0;

        for (int i = 0; i < alphabets.length(); i++) {
            if (alphabets.charAt(i) == 'A' || alphabets.charAt(i) == 'E' || alphabets.charAt(i) == 'I' || alphabets.charAt(i) == 'O' || alphabets.charAt(i) == 'U') {
                vowelCount++;
            } else {
                consonantsCount++;
            }
        }

        char[] vowelsArray = new char[vowelCount];
        char[] consonantsArray = new char[consonantsCount];
        int k = 0;
        int l = 0;
        for (int j = 0; j < alphabets.length(); j++) {

            if (alphabets.charAt(j) == 'A' || alphabets.charAt(j) == 'E' || alphabets.charAt(j) == 'I' || alphabets.charAt(j) == 'O' || alphabets.charAt(j) == 'U') {


                if (k < vowelCount) {
                    vowelsArray[k] = alphabets.charAt(j);
                    k++;
                }


            } else {
                if (l < consonantsCount) {
                    consonantsArray[l] = alphabets.charAt(j);
                    l++;
                }

            }
        }
        System.out.println("These are the vowels");
        for (char c : vowelsArray) {
            System.out.println(c);
        }
        System.out.println("These are the consonants");
        for (char d : consonantsArray) {
            System.out.println(d);
        }


    }

}

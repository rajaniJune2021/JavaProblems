package Collections;

public class HashMapConvertIntegerToRomanCharacter {

    public static void main(String[] args) {
        //LXIXI

        int number = 69;
        int[] integerValues = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String romanValues[] = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder romanEquivalent = new StringBuilder();
        for (int i = 0; i < integerValues.length; i++) {
            while (number >= integerValues[i]) {
                number = number - integerValues[i];
                romanEquivalent.append(romanValues[i]);
            }
        }
        System.out.println("roman equivalent is:" + romanEquivalent.toString());
    }
}

public class StringPrintAllTheSubStringOfGivenString {

    public static void main(String[] args) {
        // Print all the possibilities of substring of given input string - n, no, not, o,ot,t

        String inputString = "not";// n, no, not, o,ot,t
        int n = inputString.length();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                System.out.println(inputString.substring(i, j));
            }

        }
    }
}

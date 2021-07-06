public class StringLengthExample {

    public static void main(String[] args) {
        int i = 0;
        int length = 0;
        String s = "Java is a programming language";
        try {
            for (i = 0; 0 <= i; i++) {
                s.charAt(i);
                length++;
            }
        } catch (Exception e) {
            System.out.println(length);

        }

    }
}
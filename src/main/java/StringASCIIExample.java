public class StringASCIIExample {
    public static void main(String[] args) {

        String s = "abc123ABC";
        char[] c = s.toCharArray();

        for(int i= 0; i<c.length;i++){
            int value = c[i];
            System.out.println("ASCII value of " + c[i] + " is " + value);
        }
    }
}

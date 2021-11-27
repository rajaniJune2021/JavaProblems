import java.util.Arrays;

public class ArraysCharCountWithArraysFill {

    public static String getCustomizedCountOfCharAsString(int count) {
        char[] chars = new char[count];
        Arrays.fill(chars, 'T');
        String getCustomizedCharCount = Arrays.toString(chars);
        return getCustomizedCharCount;
    }

    public static String getFirstInteger() {
        String s = "123/500 characters";
        String[] s2 = s.split("/");
        return s2[1].substring(0,3);
    }

    public static void main(String[] args) {
        System.out.println(getCustomizedCountOfCharAsString(1));
        System.out.println(getFirstInteger());
    }
}

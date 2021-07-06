import java.util.Arrays;

public class ArrayFindTheLargestNUmberAfterReversinTheArray {



    public static void main(String[] args) {
        int[] a ={12,44,46};
        int[] b = new int[a.length];
        int count =0;
        for (int i=0; i<a.length;i++){
            try {
                b[i] = reverseTheIntValue(a[i]);
            }catch (Exception e){
             e.printStackTrace();
            }
        }
        Arrays.sort(b);
        System.out.println(b[b.length-1]);
    }

    public static int reverseTheIntValue(int num){
        int reverse = 0;
        while(num!=0){
            int r = num%10;
            reverse = reverse*10+r;
            num = num/10;
        }
        return reverse;
    }
}

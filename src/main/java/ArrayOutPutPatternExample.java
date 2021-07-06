import java.util.Arrays;

public class ArrayOutPutPatternExample {
    public static void main(String[] args) {

        int[] arrayInput ={0,1,1,1,0};
        Arrays.sort(arrayInput);
        int count = arrayInput.length;

        int i =0;
        int j =count-1;
        while(i<j){
            System.out.println(arrayInput[i++]);
            System.out.println(arrayInput[j--]);
        }

        if(count%2 !=0){
            System.out.println(arrayInput[i]);
        }


    }
}

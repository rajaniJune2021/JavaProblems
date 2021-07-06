import java.util.Arrays;


// wap to increment the elements of array by one but no value should be equal to the largest number
// initial maximum element of the array given input -{1,2,3,4,5,6,7,8,9} output value -{2,3,4,5,6,7,8,8,9}

public class ArrayIncrementelementwithOneButNoValueShouldBeEqual {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.sort(intArray);
        int largestelement = intArray[intArray.length-1];

        for(int i=0; i<intArray.length;i++){
            if(intArray[i]<largestelement && intArray[i]+1<largestelement) {
                intArray[i] = intArray[i]+1;
            }
        }

        for (int j:intArray){
            System.out.println(j);
        }


    }
}



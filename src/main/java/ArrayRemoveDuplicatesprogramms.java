import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

class ArrayRemoveDuplicatesPrograms {

    //remove the duplicate elements of array;
    //input is {0,1,1,1,0,0} -output should be {0,1,0,1,0,1};
    //combine two arrays into single array and eliminate if any duplicates found
    //WAP to print the elements of an array whose sum is equal to 5 -{1,2,3,4}
    //WAP to check if two arrays are equal - size should be matching and elements should be matching;
    //Wap to reverse the array
    //Print all the capital letters of a given string
    //WAP print the median of an array - 6 median - 3.5
    //string, array - framing q and solving.
    //array - ["java", "csharp","c","java"]


    public static void main(String[] args) {
        int[] intArray ={1,3,5,6,4,3,6};
        Arrays.sort(intArray);
        for(int i=0;i<intArray.length;i++){
            for(int j=i+1; j<intArray.length;j++){
                if(intArray[i]==intArray[j]){
                   intArray = ArrayUtils.remove(intArray,j);
                }
            }
        }
        for(int k:intArray){
            System.out.println(k);
        }
    }


}

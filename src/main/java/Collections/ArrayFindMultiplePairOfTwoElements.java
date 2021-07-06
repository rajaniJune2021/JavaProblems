package Collections;


import java.util.Arrays;

// {-5,-1,4,22,1,0,2,-22} - multiply pair of two elements find the max product of pair and print out.
public class ArrayFindMultiplePairOfTwoElements {

    public static void main(String[] args) {

        int[] array = {-5,-1,4,22,1,0,2,-22};
        Arrays.sort(array);

     int temp =  array[0] * array[1];
     int temp2 = array[array.length-2] *array[array.length-1];
                if(temp < temp2){
                    System.out.println(array[array.length-2] +" "+array[array.length-1]);
                }else {
                    System.out.println(array[0] +" "+ array[1]);
                }
    }
}

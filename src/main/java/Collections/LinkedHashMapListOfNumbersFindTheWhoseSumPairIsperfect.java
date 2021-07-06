package Collections;

import java.util.*;

// wap given a list of numbers find the whose sum pair is perfect square Ex: 1,2,3,4,5,6 ex: 3+6 =9; 1+3=4
public class LinkedHashMapListOfNumbersFindTheWhoseSumPairIsperfect {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
       List<Integer> list = new LinkedList<Integer>();

       int sum=0;
       for(int i=0;i<a.length;i++) {
           for (int j = 0; j < a.length; j++) {
               if((i+1)<a.length){
               sum = a[i] + a[j];
               double sqrt = Math.sqrt(sum); // let's take square root of 4 is 2 ; square root of 5 is 2.5
               if(sqrt-Math.floor(sqrt) == 0){ // mat. floor function will be taking the after decimal number ( square is 2 - 0.5) = 1.5 != 0)
                   System.out.println("values whose sum is a perfect square are:"+a[i] + " "+a[j]);
               }
              }
           }

       }

    }

}

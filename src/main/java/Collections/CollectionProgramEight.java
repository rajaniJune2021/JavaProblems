package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Given an array n no.of values in the range{0-n} find the missing number from that range input : {3,0,1} - output is : 2 second output {3,0} output is {1,2}
public class CollectionProgramEight {
    public static void main(String[] args) {
        int [] n ={0,3};
        Arrays.sort(n);
        int size= n[n.length-1];
//        for(int i=n.length-1;i<n.length;i++){
//            size = n[i];
//        }
     //   boolean b=false;

     //   int[] n1 = new int[size+1];
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<size;i++){
            for(int j=0;j<n.length;j++)
          try{
            if(i==n[j]){
                i++;
            }else{
                set.add(i);
            }}catch (IndexOutOfBoundsException e){
              e.printStackTrace();
          }

        }
      for(int k: set){
          System.out.println(k);
      }

    }
}

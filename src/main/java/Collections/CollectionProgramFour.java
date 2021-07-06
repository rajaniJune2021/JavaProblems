package Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Given an integer array construct a new array where each element is the no. of smaller elements to the right of that number in first array input: {1,3,4,2,0} output {1,2,2,1,0}
public class CollectionProgramFour {

    public static void main(String[] args) {
        int[] array = {1,3,4,2,0};

        int[] n = new int[array.length];
      //  int count =1;
        int counter=0;
//        Map<Integer,Integer> map = new LinkedHashMap<>();
//
//
//        for(int i=0; i<array.length; i++){
//            for(int j=i+1;j<array.length;j++){
//                if(array[i]>array[j]){
//                   Integer n = map.get(array[i]);
//                   if(n != null) {
//                       map.put(array[i], count+1);
//                   }else{
//                       map.put(array[i],count);
//                   }
//                }
//            }
//            if(i== array.length-1){
//                map.put(array[i],0);
//            }
//        }
//
//        int[] newArray = new int[map.size()];
//        for (int k=0; k<map.size(); k++){
//            newArray[k] = map.get(array[k]);
//        }
//
//        for (int i=0;i<newArray.length;i++){
//            System.out.print(newArray[i]+",");
//        }

        for(int i=0; i<array.length; i++){
        for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                   n[i] = ++counter;

                }else{
                    n[i] = counter;
                }
        }
        counter=0;
        }
        for(int k: n){
            System.out.println(k);
        }

    }
}

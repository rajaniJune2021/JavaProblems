package Collections;


import java.util.HashMap;
import java.util.Map;

// An array contains the Integer keys and another arrau contains the string values - wap to store those keys and values  in a hashmap
public class HashMapTwoArraysHoldingDifferentSetOfKeysAndValuesStroreThoseInHashMap {

    public static void main(String[] args) {
        int[] keyArray ={1,2,3,4};
        String[] valuesArray ={"Java","csharp","python","ruby","javascript"};
        Map<Integer,String> map = new HashMap<>();
        Integer k = null;
        if(keyArray.length == valuesArray.length) {
            for (int i = 0; i < keyArray.length; i++) {
                for (int j =0 ; j<=i; j++) {
                    map.put(keyArray[i],valuesArray[j]);
                }
            }
        } else if(keyArray.length+1 == valuesArray.length){
            for (int i = 0; i < keyArray.length; i++) {
                for (int j =0 ; j<=i; j++) {
                    map.put(keyArray[i],valuesArray[j]);
                }
            }
            map.put(k,valuesArray[valuesArray.length-1]);

        }
            else

            {
                for (int i = 0; i < keyArray.length; i++) {
                    for (int j = 0; j <=i ;j++) {
                        try {
                            map.put(keyArray[i],valuesArray[j]);
                        }catch (ArrayIndexOutOfBoundsException e){
                            map.put(keyArray[i],"");
                        }
                    }
                }
        }

        System.out.println(map);

    }
}

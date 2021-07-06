import org.apache.commons.lang3.ArrayUtils;

public class ArrayRemoveDuplicates {

    public static void main(String[] args) {
        int intFirstArray[] = {2, 3, 6, 8, 9, 0, 1};
        int secondArray[] = {3, 6, 7, 8, 9, 10};
        int firarrayLength = intFirstArray.length;
        int duplicateSize = 0;

        for (int i = 0; i < intFirstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (intFirstArray[i] == secondArray[j]) {
                    duplicateSize++;
                }
            }
        }
      //  System.out.println(duplicateSize);

        int thirdArraylength = intFirstArray.length + secondArray.length - duplicateSize;
        int thirdArray[] = new int[thirdArraylength];

        for (int k = 0; k < intFirstArray.length; k++) {
            thirdArray[k] = intFirstArray[k];
        }


        for (int l = 0; l < secondArray.length; l++) {
            for(int n=0;n<thirdArray.length;n++) {
                if (secondArray[l] == thirdArray[n]) {
//                    ArrayUtils.remove(secondArray, l);
                 thirdArray  = ArrayUtils.remove(secondArray,l);
                } else {
                    firarrayLength++;
                    thirdArray[firarrayLength] = secondArray[l];
                }
            }
        }


        for (int l = 0; l < thirdArray.length; l++) {
            for (int n = 0; n < secondArray.length; n++) {
                if (secondArray[n] == thirdArray[l]) {
                  secondArray = ArrayUtils.remove(secondArray, l);
                }
            }

            for (int m : secondArray) {
                System.out.println(m);
            }

        }
    }


//        for(int k=0; k<intFirstArray.length;k++){
//            thirdArray[k] = intFirstArray[k];
//        }
//
//        for(int i=0;i<intFirstArray.length;i++){
//            for(int j=0;j<secondArray.length;j++){
//                if(intFirstArray[i]==secondArray[j]){
//                    thirdArray =  ArrayUtils.remove(secondArray,secondArray[j]);
//                }
//            }
//        }


//        for (int i = 0; i < intFirstArray.length; i++) {
//            thirdArray[i] = intFirstArray[i];
//        }
//
//        for (int j = 0; j < secondArray.length; j++) {
//            thirdArray[firarrayLength] = secondArray[j];
//            for (int l = 0; l < thirdArray.length; l++) {
//                if (secondArray[j] == thirdArray[firarrayLength]) {
//                    thirdArraylength--;
//                } else {
//                    thirdArray[firarrayLength] = secondArray[j];
//                    firarrayLength++;
//                }
//            }
//        }
//
//        for (int k : thirdArray) {
//            System.out.println(k);
//        }
//    }

}

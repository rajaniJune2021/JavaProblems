public class ArrayMedianValue {
    public static void main(String[] args) {
        int[] intArray = {100, 200, 300, 400, 500, 600, 700,800};
        int arraySize = intArray.length;
        int midLength = arraySize/2;
        float medianValue;

        if(arraySize % 2 == 0) {
         medianValue =  (intArray[midLength]+intArray[midLength-1])/2;
           // System.out.println(intArray[medianValue]);

        } else {

            System.out.println(intArray[midLength]);

        }
    }
}

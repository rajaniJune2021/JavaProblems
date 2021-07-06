public class ArrayLargestNumberExample {
    public static void main(String[] args) {
        int intArray[] ={2,13,76,103,5,49,90,12};
        int largestNumber =0;
        for(int i=0; i<intArray.length;i++){
            if(largestNumber<intArray[i]){
                largestNumber =intArray[i];
            }
        }
        System.out.println(largestNumber);
    }
}

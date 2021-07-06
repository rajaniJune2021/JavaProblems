public class ArrayReversetheGivenInput {

    public static void main(String[] args) {
        int[] intArray = {1,3,5,7,9,0,6};
        int lastIndexOfArray = intArray.length-1;
        int temp =0;

        for (int i=0;i<intArray.length/2;i++){
            temp = intArray[i];
            intArray[i] = intArray[lastIndexOfArray];
            intArray[lastIndexOfArray] = temp;
            lastIndexOfArray--;
        }
        for(int j: intArray){
            System.out.println(j);
        }
    }
}

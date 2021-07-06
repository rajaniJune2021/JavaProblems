public class ArrayToFindTwoElementsWhoseSumIsLargestElementInArray {

    public static void main(String[] args) {
        int[] intArray = {1,4,10,6};
        int largestNumber =0;

        for(int i=0; i<intArray.length;i++){
            if(intArray[i]>largestNumber){
                largestNumber = intArray[i];
            }
        }

        System.out.println("This is largest number in given array" + largestNumber);
        int sum;

        for(int j=0; j<=intArray.length-1;j++){
            for(int k=j+1; k<=intArray.length-1;k++){
                sum = intArray[j]+intArray[k];
                if(sum == largestNumber){
                    System.out.println("These two elements of sum equals to the largest element of given array " + intArray[j] +intArray[k]);
                }
            }
        }


    }
}

public class ArrayCombiningTwoArrays {
    public static void main(String[] args) {
        int intFirstArray[] = {2,3,6,8,9,0,1};
        int secondArray[] ={3,6,7,8,9,10};
        int lengthOfFirstArray = intFirstArray.length;
        int sizeOfThirdArray = intFirstArray.length+ secondArray.length;
        int thirdArray[] = new int[sizeOfThirdArray];

        for (int i=0;i<intFirstArray.length;i++){
          thirdArray[i] =intFirstArray[i];
        }
        for(int j=0;j<secondArray.length;j++){
            thirdArray[lengthOfFirstArray] = secondArray[j];
            lengthOfFirstArray++;
        }
        System.out.println("Combination of two arrays");
        for(int k: thirdArray){
            System.out.print(k+",");
            //example
        }

    }
}

public class ArrayForEachElementtoFindTheNextLargestElement {

    //wap for each element find the next largest element input: {2,4,3,5,1,15} output {4,5,15,-1}

    public static void main(String[] args) {
        int[] intArray = {15, 4, 3,18, 5, 1};
        int largestNumber;

        for (int i = 0; i < intArray.length; i++) {
           try{
               largestNumber = intArray[i];
            int j = intArray[i+1];
            if(j> largestNumber) {
                System.out.println(intArray[i] +"------->" +j);
            }
           }catch (IndexOutOfBoundsException e){
               System.out.println("-1");
           }
        }
    }

}
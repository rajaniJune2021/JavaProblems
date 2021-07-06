public class ArrayEvenAndOddNumbersExample {

    public static void main(String[] args) {
        int intArray[] = {2,9,5,6,8,3,6,10};


        for (int i=0;i<intArray.length;i++){

            if(intArray[i]%2 == 0){
                System.out.print("These are even numbers "+i);
            }
            else if(intArray[i]%2 ==1){
                System.out.print("these are odd numbers " +i);
            }

        }

//        for(int j: intArray){
//            if(intArray[j]%2 == 0){
//                System.out.print("These are even numbers "+j);
//            }
//            else if(intArray[j]%2 ==1){
//                System.out.print("these are odd numbers " +j);
//            }
//        }


    }
}

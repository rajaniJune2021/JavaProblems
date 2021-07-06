public class ArrayPrintIntValuesExampleone {

//    Array is a homogenous data structure, it stores similar data types
//    Array size is fixed size, it can't be decremented or incremented.
//    Decalration of array:
//    Datatype[] arrayName;
//    Datatype []arrayName;
//    Datatype arrayName[];
//    char[] c;
//    char []c;
//    char c[];

    public static void main(String[] args) {
        int[] intArray ={1,2,3,4,5,6,7,8,9,10};
        int count =0;
        try{
        for(int i=0; 0<=i;i++){
            System.out.println(intArray[i]);
            count++;
        }}catch (Exception e){
            System.out.println("the value of array size is "+ count);
        }
//        for(int j : intArray){
//            System.out.println(j);
//        }
        int increment =0;
        for (int j: intArray){
            System.out.println(j);
            increment++;
        }
        System.out.println("the value of array size is "+ increment);
    }

    // calculate the all the sum of an array;
    // print the largest number of an array;
    // print the odd numbers and even numbers of given array separately
    //if first array is '1234', second array '6,7,8,9' and result array should have all the numbers; combining two arrays into single array.
}

public class ArraySumExample {

    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7,8,9};
        int sum =0;
        for(int i=0; i<intArray.length;i++){
            sum = sum+ intArray[i];
        }
        System.out.println(sum);
    }
}




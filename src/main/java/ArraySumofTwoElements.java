public class ArraySumofTwoElements {

    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};

        for (int i=0; i<intArray.length;i++){
            for(int j=i+1;j<intArray.length;j++){

                if(intArray[i]+intArray[j] == 5){
                    System.out.println("These are two elements set sum equal to 5 " + intArray[i] +" " +intArray[j]);
                }

            }
        }

    }
}

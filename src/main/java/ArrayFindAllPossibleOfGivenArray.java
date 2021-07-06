class ArrayFindAllPossibleSubArraysOfGivenArray {

    // Take an array of 5 elements find all the possible sub arrays of this array input {1,2,3,4,5,} - 1}
//{1,2}, 2, {2,3}.{2,4} {2,5} {2,3,4}, {2,3,4,5} etc

    //n*n+1/2 =15


    public static void main(String[] args) {

        int temp =1;
        int[] intArray = {1,2,3,4,5};

        // 1, {1,2},{1,2,3}, {1,2,3,4}.. 5;  2, {2,3}, {2,3,4}..2-5; 3, {3,4), ...

        int length = intArray.length;
        for(int i =0; i<length;i++){
                for(int j=i;j<length;j++){
                    for(int k=i;k<=j;k++){
                        System.out.println(intArray[k]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }

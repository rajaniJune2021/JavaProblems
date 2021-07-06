public class ArraySizeAndElementsMatchingExample {

    public static void main(String[] args) {
        int[] intFirstArray ={1,2,3,4,5,0};
        int[] intSecondArray ={1,2,3,4,5,6};
        int sizeOfFirstArray = intFirstArray.length;
        int sizeOfSecondArray = intSecondArray.length;
        boolean b =false;

        if(sizeOfFirstArray == sizeOfSecondArray){

           for(int i=0; i<intFirstArray.length;i++){
                 b=false;
              if(intFirstArray[i] == intSecondArray[i]){
                  b = true;
              }
           }
           if(b){
            System.out.println("These two arrays are having same size and elements matched");}
           else {
               System.out.println("Given Two arrays are not identical");
           }
        }




    }
}

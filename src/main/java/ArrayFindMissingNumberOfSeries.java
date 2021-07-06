public class ArrayFindMissingNumberOfSeries {

    //n*n+1/2 =15

    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6,7,9,10};
         int sumOfTotal = (a[a.length-1] * (a[a.length-1]+1))/2;
         int sum =0;

         for(int i=0;i<a.length;i++){
             sum  = sum+a[i];
         }
        System.out.println("Missing number is " + (sumOfTotal-sum));

    }
}
